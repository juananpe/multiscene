package eus.ehu.multiscene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    private Stage appStage;
    private Scene scene;
    private Window mainWindow, loginWindow;

    class Window {
        FXController c;
        Parent ui;
    }

    private Window load(String fxmlFile) throws IOException {
        Window window = new Window();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        window.ui = loader.load();
        ((FXController) loader.getController()).setMain(this);
        window.c = loader.getController();
        return window;
    }
    @Override
    public void start(Stage stage) throws IOException {

        appStage = stage;
        loginWindow = load("login.fxml");
        mainWindow = load("mainMenu.fxml");

        show("Login");
    }

    private void setupScene(Parent ui, String title) {
        if (scene == null) {
            scene = new Scene(ui);
        }
        scene.setRoot(ui);
        appStage.setScene(scene);
        appStage.setTitle(title);
        appStage.show();
    }

    public void show(String title) {
        switch (title) {
            case "Login" -> setupScene(loginWindow.ui, "Login");
            case "Main Menu" -> setupScene(mainWindow.ui, "Main Menu");
        }
    }
}

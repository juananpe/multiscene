package eus.ehu.multiscene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    private Stage appStage;
    private Scene loginScene;
    private Scene mainMenuScene;

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent loginUI = loginLoader.load();
        LoginController loginController = loginLoader.getController();
        loginController.setMain(this);

        FXMLLoader mainMenuLoader = new FXMLLoader(getClass().getResource("mainMenu.fxml"));
        Parent mainMenuUI = mainMenuLoader.load();
        MainMenuController mainMenuController = mainMenuLoader.getController();
        mainMenuController.setMain(this);

        loginScene = new Scene(loginUI);
        mainMenuScene = new Scene(mainMenuUI);
        appStage = stage;

        stage.setTitle("Login");
        stage.setScene(loginScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void show(String title) {
        switch (title) {
            case "Login" -> {
                appStage.setTitle("Login");
                appStage.setScene(loginScene);
            }
            case "Main Menu" -> {
                appStage.setTitle("Main Menu");
                appStage.setScene(mainMenuScene);
            }
        }
    }
}

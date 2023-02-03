package eus.ehu.multiscene;

import javafx.fxml.FXML;

public class MainMenuController {

    private Application main;

    @FXML
    void logoutClick() {
        main.show("Login");
    }

    @FXML
    void initialize() {

    }

    public void setMain(Application application) {
        this.main = application;
    }
}

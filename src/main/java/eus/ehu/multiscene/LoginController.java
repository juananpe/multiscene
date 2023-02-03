package eus.ehu.multiscene;

import javafx.fxml.FXML;

public class LoginController implements FXController {

    private Application main;

    @FXML
    void loginClick() {
        // check credentials
        // if correct, go to main menu
        main.show("Main Menu");
    }

    @FXML
    void initialize() {

    }

    public void setMain(Application application) {
        this.main = application;
    }
}

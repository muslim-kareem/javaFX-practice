package com.javafx.login_between_scenes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
    @FXML
    Label nameLabel;

    public void displayName(String username){
        nameLabel.setText("Hallo "+username+ "  from Scene2Controller");
    }

}

package com.javafx.radioButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {

    @FXML
    Label myLabel;

    @FXML
    RadioButton rButton1,rButton2,rButton3;

    public void getFood(ActionEvent event){
        if(rButton1.isSelected()){
            myLabel.setText("PIZZA");
        } else if (rButton2.isSelected()) {
            myLabel.setText("SUSHI");
        }else{
            myLabel.setText("SPAGHETTI");
        }
    }

}

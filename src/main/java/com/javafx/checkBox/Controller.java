package com.javafx.checkBox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Controller {

    final  File PATH_TO_FXML_FILE = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/checkBox/Light-on.png");
    final  File PATH_TO_FXML_FILE2 = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/checkBox/Light-of.png");

    @FXML
    CheckBox myCheckBox;

    @FXML
    Label myLabel;
    @FXML
    ImageView myImageView;

    Image myImage1 = new Image(PATH_TO_FXML_FILE.toURI().toString());
    Image myImage2 = new Image(PATH_TO_FXML_FILE2.toURI().toString());


    public void change(ActionEvent event){
        if(myCheckBox.isSelected()){
            myLabel.setText("ON");
            myImageView.setImage(myImage1);
        }else{
            myLabel.setText("OF");
            myImageView.setImage(myImage2);
        }
    }


}

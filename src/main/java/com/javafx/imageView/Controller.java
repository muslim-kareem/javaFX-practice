package com.javafx.imageView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Controller {


    File scene1Path = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/imageView/Sleepy-Cat.png") ;

    // ImageView is a Node used for painting images loaded with Images

    @FXML
    ImageView myImageView;

    @FXML
    Button myButton;
    Image myImage = new Image(scene1Path.toURI().toString());
    @FXML
    Image myImage2 = new Image(new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/imageView/Funny-Cat.png").toURI().toString());

    boolean flag = false;
    public void displayImage(){
        flag = !flag;
        if(flag){
            myImageView.setX(80);
            myImageView.setImage(myImage);
        }else {
            myImageView.setX(0);
            myImageView.setImage(myImage2);
        }

    }
}

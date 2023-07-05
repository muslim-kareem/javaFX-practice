package com.javafx.keyEvent;

import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public class Controller {


//    public void moveUp(){
//        System.out.println("MOVE' UP!");
//    }
//
//    public void moveDown(){
//        System.out.println("MOVE' DOWN");
//    }
//    public void moveLeft(){
//        System.out.println("MOVE' LEFT");
//    }
//    public void moveRight(){
//        System.out.println("MOVE' RIGHT");
//    }


    public void initialize(Scene scene){
        scene.setOnKeyPressed(this::handleKeyPressEvent);
    }

    public void handleKeyPressEvent(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case Q:
                System.out.println("Q gedrückt");
                break;
            case DIGIT1:
                System.out.println("1 gedrückt");
                break;
            case PERIOD:
                System.out.println(". gedrückt");
                break;
            default:
                System.out.println(
                        "Text: " + keyEvent.getText() + " Code zum Text: " + keyEvent.getCode());
                break;
        }
    }

}

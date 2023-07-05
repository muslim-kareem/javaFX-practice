package com.javafx.circle_action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class CircleController {
    @FXML
     Circle myCircle;
    private double x;
    private double y;
    public void up(ActionEvent e) {
        myCircle.setCenterY(x-=10);
    }

    public void down(ActionEvent e) {
        myCircle.setCenterY(x+=10);
    }

    public void right(ActionEvent e) {
        myCircle.setCenterX(x+=10);
    }

    public void left(ActionEvent e) {
        myCircle.setCenterX(x-=10);
    }


}
package com.javafx.animations;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ImageView myImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Translate
//        TranslateTransition translate = new TranslateTransition();
//        translate.setNode(myImageView);
//        translate.setDuration(Duration.millis(10000));
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setByX(500);
//        translate.setAutoReverse(true);
//        translate.play();

        // Rotate
//        RotateTransition rotate = new RotateTransition();
//        rotate.setNode(myImageView);
//        rotate.setDuration(Duration.millis(500));
//        rotate.setCycleCount(TranslateTransition.INDEFINITE);
//        rotate.setInterpolator(Interpolator.LINEAR);
//        rotate.setByAngle(360);
//        rotate.setAxis(Rotate.Z_AXIS);
//        rotate.setAutoReverse(true);
//        rotate.play();


        //Fade
//        FadeTransition fade = new FadeTransition();
//        fade.setNode(myImageView);
//        fade.setDuration(Duration.millis(500));
//        fade.setCycleCount(TranslateTransition.INDEFINITE);
//        fade.setInterpolator(Interpolator.LINEAR);
//        fade.setFromValue(0);
//        fade.setToValue(1);
//        fade.setAutoReverse(true);
//        fade.play();


        // Scale
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myImageView);
        scale.setDuration(Duration.millis(500));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(2);
        scale.setByY(2);

        scale.setAutoReverse(true);
        scale.play();


    }
}

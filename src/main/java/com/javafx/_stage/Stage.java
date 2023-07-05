package com.javafx._stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;

import java.io.File;
import java.io.IOException;

public class Stage extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(javafx.stage.Stage stage) throws IOException {
        // set some group of node this is type of Scene-graph
        Group root = new Group();

        // set scene to the stage
        Scene scene = new Scene(root, Color.BLACK);
        stage.setScene(scene);
        stage.show();
//
//        // set Icon
//        Image image = new Image(new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/resources/icon.jpg").toURI().toString());
//        stage.getIcons().add(image);
//
//
//        // Title
//        stage.setTitle("MyTitle");
//
//        // set the width & height
//        stage.setWidth(420);
//        stage.setHeight(420);
//
//        // set the fix size
//        stage.setResizable(false);
//
//        //set x/y position
//          // stage.setX(50);
//          // stage.setY(50);
//
//        // set full screen
//        stage.setFullScreen(true);
//
//        // set screen exit hint
//        stage.setFullScreenExitHint(new String("HINT \"q\" TO SCAPE")); // doesn't work
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));


    }
}
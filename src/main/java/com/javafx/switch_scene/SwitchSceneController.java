package com.javafx.switch_scene;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class SwitchSceneController {
    File scene1Path = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/switch_scene/Scene1.fxml");
    File scene2Path = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/switch_scene/Scene2.fxml");

    private Scene scene;
    private Stage stage;
    private FXMLLoader root;


    public void switchToScene1(ActionEvent e) throws IOException {
        root = new FXMLLoader(scene1Path.toURI().toURL());
        // get the actual stage from ActionEvent
        stage =  (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root.load());
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent e) throws IOException {
        root = new FXMLLoader(scene2Path.toURI().toURL());
        // get the actual stage from ActionEvent
        stage =  (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root.load());
        stage.setScene(scene);
        stage.show();
    }

}

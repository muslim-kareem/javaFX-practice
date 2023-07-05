package com.javafx.textField;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    File scene1Path = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/textField/TextField.fxml");
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(scene1Path.toURI().toURL());
        Scene scene = new Scene(root.load());
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}



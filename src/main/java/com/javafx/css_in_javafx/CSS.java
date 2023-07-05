package com.javafx.css_in_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class CSS extends Application {

    File xfmlPath = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/css_in_javafx/CSS.fxml");
    File CSSPath = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/css_in_javafx/style.css");
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(xfmlPath.toURI().toURL());
        Scene scene = new Scene(fxmlLoader.load());


        //set the CSS file to the scene
        //scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        String css = CSSPath.toURI().toURL().toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}



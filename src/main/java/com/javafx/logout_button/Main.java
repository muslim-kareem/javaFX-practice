package com.javafx.logout_button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    File scene1Path = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/logout_button/Logout.fxml");
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(scene1Path.toURI().toURL());
        Scene scene = new Scene(root.load());
        stage.setScene(scene);
        stage.show();

        // this line just to use logout method when click the x(windowEvent)
        stage.setOnCloseRequest(windowEvent -> logout(stage));
    }

    public void logout(Stage stage){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to save before exiting?: ");

        if(alert.showAndWait().get() == ButtonType.OK){
            System.out.println("You successfully logged out ");
            stage.close();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}
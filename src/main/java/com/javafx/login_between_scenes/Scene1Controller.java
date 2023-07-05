package com.javafx.login_between_scenes;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Scene1Controller {
    File xfmlPath = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/login_between_scenes/Scene2.fxml");
    // get the input TextField
    @FXML
    TextField nameTextField;
    private Scene scene;
    private Stage stage;
    private Parent root;


    public void login(ActionEvent e) throws IOException {
        // get the text from the user input
        String username = nameTextField.getText();

        // load the
        FXMLLoader loader = new FXMLLoader(xfmlPath.toURI().toURL());
        root = loader.load();

        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.displayName(username);

        // get the actual stage from ActionEvent
        stage =  (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

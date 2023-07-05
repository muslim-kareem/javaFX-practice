package com.javafx.keyEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;

public class Main extends Application {
   File scene1Path = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx/keyEvent/SomeFXML.fxml");
    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {
        System.out.println(getClass().getResource(""));
        FXMLLoader loader = new FXMLLoader(scene1Path.toURI().toURL());
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Controller controller = loader.getController();
        controller.initialize(scene);



        stage.setScene(scene);


        var logo = new Image(new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/resources/img.pngg").toURI().toString());
        stage.getIcons().add(logo);
        if (Taskbar.isTaskbarSupported()) {
            var taskbar = Taskbar.getTaskbar();
            if (taskbar.isSupported(Taskbar.Feature.ICON_IMAGE)) {
                final Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
                var dockIcon = defaultToolkit.getImage(getClass().getResource("/img.png"));
                taskbar.setIconImage(dockIcon);
            }
        }
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}



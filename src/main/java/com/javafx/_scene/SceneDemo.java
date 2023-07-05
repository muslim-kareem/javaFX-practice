package com.javafx._scene;

import javafx.application.Application;
import javafx.scene.Group;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class SceneDemo extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {
        // Scene -> Group(Scene-graph) -> nodes
        // set some node Group
        Group root = new Group();

        // set scene to the stage
       Scene scene = new Scene(root, 600,600,Color.SKYBLUE);

        // create a Text node and add it to the root group type
        Text text = new Text();
        text.setText("WHooooA!!");

        // set the coordinate
        text.setX(50);
        text.setY(50);

        // set the font of the text
        text.setFont(Font.font("Verdana",50));

        // setColor
        text.setFill(Color.GREEN);

        // create Line node and set the position and the shape
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        // this is for the width and color
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        // for the transparency
        line.setOpacity(0.3);
        // to rotate object
        line.setRotate(90);

        //---------------------
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(150);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLACK);
        rectangle.setStrokeWidth(100); // ??
        rectangle.setStroke(Color.DARKGREY);
        //-------------------------
        Polygon triangle = new Polygon();
        triangle.setLayoutX(200);
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
        );
        triangle.setFill(Color.YELLOW);
        triangle.setRotate(135);
        // -------------------------
        Circle circle = new Circle();
        circle.setCenterX(150);
        circle.setCenterY(400);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);
        // -------------------
//        Image image = new Image(getClass().getResource("icon.jpg").toURI().toString());
//        ImageView imageView = new ImageView(image);
//        imageView.setX(300);
//        imageView.setY(400);
//        imageView.setFitWidth(200);
//        imageView.setFitHeight(200);

        // add the nodes to the group(Scene-graph)
        root.getChildren().add(text);
        root.getChildren().add(line);
//        root.getChildren().add(rectangle);
//        root.getChildren().add(triangle);
//        root.getChildren().add(circle);
//        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }
}
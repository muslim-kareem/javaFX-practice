package com.javafx.treeView.JPT_File_Example;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FileTreeViewExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the root node for the TreeView
        TreeItem<String> root = new TreeItem<>("Files");
        root.setExpanded(true);

        // Create a File object for the directory to be displayed
        File directory = new File("/Users/kareem89/IdeaProjects/course-preparation/javaFX/src/main/java/com/javafx");

        // Call a recursive method to populate the TreeView with files and directories
        addTreeItems(root, directory);

        // Create the TreeView and set the root node
        TreeView<String> treeView = new TreeView<>(root);

        // Create a StackPane to hold the TreeView
        StackPane rootPane = new StackPane(treeView);

        // Create the Scene and add the StackPane
        Scene scene = new Scene(rootPane, 400, 400);

        // Set the Scene and show the Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("File TreeView");
        primaryStage.show();
    }

    /**
     * Recursive method to populate a TreeItem with files and directories
     */
    private void addTreeItems(TreeItem<String> parentItem, File parentFile) {
        // Loop through the files and directories in the parent directory
        for (File file : parentFile.listFiles()) {
            // Create a new TreeItem for the file or directory
            TreeItem<String> item = new TreeItem<>(file.getName());

            // Add the item to the parent item
            parentItem.getChildren().add(item);

            // If the item represents a directory, call this method recursively
            if (file.isDirectory()) {
                addTreeItems(item, file);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

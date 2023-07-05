package com.javafx.save_names_with_Alert;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameSaverApp extends Application {
    private List<Person> peopleListView = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Name Saver App");

        VBox root = new VBox();

        TextField firstNameTextField = new TextField();
        firstNameTextField.setPromptText("Enter first name");

        TextField lastNameTextField = new TextField();
        lastNameTextField.setPromptText("Enter last name");

        Button addButton = new Button("Add");
        addButton.setOnAction(event -> {
            String firstName = firstNameTextField.getText();
            String lastName = lastNameTextField.getText();

            if (!firstName.isEmpty() && !lastName.isEmpty()) {
                Person person = new Person(firstName, lastName);
                peopleListView.add(person);

                firstNameTextField.clear();
                lastNameTextField.clear();

                // Show the name of the person that was just added
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Person Added");
                alert.setHeaderText(null);
                alert.setContentText("Person " + person.getFullName() + " has been added.");
                alert.showAndWait();
            }


        });

        ListView<String> peopleListView = new ListView<>();
        peopleListView.getItems().addAll(getFormattedPersonNames());

        Label fullNameLabel = new Label("test");
        root.getChildren().addAll(firstNameTextField, lastNameTextField, addButton,fullNameLabel);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private List<String> getFormattedPersonNames() {
        List<String> formattedNames = new ArrayList<>();

        for (Person person : peopleListView) {
            formattedNames.add(person.getFullName());
        }

        return formattedNames;
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static class Person {
        private final String firstName;
        private final String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }
    }
}

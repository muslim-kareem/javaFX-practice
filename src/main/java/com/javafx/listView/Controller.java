package com.javafx.listView;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private ListView<String> myListView;
    @FXML
    private Label myLabel;
    List<String> food = new ArrayList<>(List.of("pizza","sushi","ramen"));

    String currentValue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myListView.getItems().addAll(food);
        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                currentValue = myListView.getSelectionModel().getSelectedItem();
                myLabel.setText(currentValue);

            }
        });
    }
}

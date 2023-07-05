package com.javafx.datePicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller {

    @FXML
    private Label myLabel;

    @FXML
    private DatePicker myDatePicker;


    public void getDate(ActionEvent event){
        LocalDate myDate = myDatePicker.getValue();
        String formattedDate = myDate.format(DateTimeFormatter.ofPattern("dd.MM.YYYY"));
        myLabel.setText(formattedDate);
    }
}

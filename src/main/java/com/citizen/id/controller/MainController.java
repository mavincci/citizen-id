package com.citizen.id.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class MainController {
    @FXML
    private Button inbtn;

    public void handleClickER(ActionEvent actionEvent) {
        clicked ^= 1;
        inbtn.setText(labels[clicked]);
    }

    int clicked = 0;
    String[] labels = {
            "Not yet clicked", "Clicked"};
}

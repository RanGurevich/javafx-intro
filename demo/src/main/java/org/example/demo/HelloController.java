package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private VBox body;

    private final View MyView = new View();
    @FXML
    public void initialize() {
        MyView.create(body);
    }

}
package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class View {
    @FXML
    public VBox body;

    public void create(VBox Vbox, buttonClicked buttonClickedUp, buttonClicked buttonClickedDown, runFunction function) {
        HBox hbox = new HBox();
        Button up = new Button("Up");
        Button down = new Button("Down");
        Text text = new Text(function.run());
        up.setOnAction(e -> {
            buttonClickedUp.onClick();
            text.setText(function.run());
        });
        down.setOnAction(e -> {
            buttonClickedDown.onClick();
            text.setText(function.run());
        });
        hbox.getChildren().addAll(up, down, text);
        Vbox.getChildren().add(hbox);
    }
}

package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.w3c.dom.Text;

public class View {
    @FXML
    public VBox body;

    public void create(VBox Vbox) {
        HBox hbox = new HBox();
        Button up = new Button("Up");
        Button down = new Button("Down");
        hbox.getChildren().addAll(up, down);
        Vbox.getChildren().add(hbox);
    }
}

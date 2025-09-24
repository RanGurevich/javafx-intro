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
        HBox hboxFirstCounter = new HBox();
        HBox hboxCounterCreator = new HBox();
        Button createCounter = new Button("Create Counter");
        createCounter.setOnAction(e -> {
            Button upX = new Button("Up");
            Button downX = new Button("Down");
            Text textX = new Text(function.run());
            upX.setOnAction(x -> {
                buttonClickedUp.onClick();
                textX.setText(function.run());
            });
            downX.setOnAction(x -> {
                buttonClickedDown.onClick();
                textX.setText(function.run());
            });
            hboxFirstCounter.getChildren().addAll(upX, downX, textX);

        });

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
        hboxFirstCounter.getChildren().addAll(up, down, text);
        hboxCounterCreator.getChildren().add(createCounter);
        Vbox.getChildren().add(hboxFirstCounter);
        Vbox.getChildren().add(hboxCounterCreator);

    }
}

package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private VBox body;

    private final View myView = new View();
    private final Model myModel = new Model();
    private final buttonClicked buttonClickedUp = new buttonClicked() {
        @Override
        public void onClick() {
            myModel.upData();
        }
    };
    private final buttonClicked buttonClickedDown = new buttonClicked() {
        @Override
        public void onClick() {
            myModel.downData();
        }
    };
    private runFunction runFunction = new runFunction() {
        @Override
        public String run() {
            return String.valueOf(myModel.getData());
        }
    };
    private String data = String.valueOf(myModel.getData());

    @FXML
    public void initialize() {
        myView.create(body,
                () -> {
                    buttonClickedUp.onClick();
                    System.out.println("Up clicked, current value: " + myModel.num);
                    data = String.valueOf(myModel.getData());

                },
                () -> {
                    buttonClickedDown.onClick();
                    System.out.println("Down clicked, current value: " + myModel.num);
                    data = String.valueOf(myModel.getData());
                },
                () -> {
                return myModel.getData() + "";
                }
        );
    }
}

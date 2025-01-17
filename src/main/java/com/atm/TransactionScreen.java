package com.atm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class TransactionScreen {
    private Scene scene;
    private ATM app;

    public TransactionScreen(ATM app, String message) {
        this.app = app;
        createScene(message);
    }

    private void createScene(String message) {
        Label messageLabel = new Label(message);
        Button backButton = new Button("Back");

        backButton.setOnAction(e -> {
            MainMenuScreen mainMenu = new MainMenuScreen(app);
            app.setScene(mainMenu.getScene());
        });

        VBox vbox = new VBox(10, messageLabel, backButton);
        vbox.setAlignment(Pos.CENTER);

        scene = new Scene(vbox, 400, 300);
    }

    public Scene getScene() {
        return scene;
    }
}


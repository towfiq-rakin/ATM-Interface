package com.atm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class WithdrawScreen {
    private Scene scene;
    private ATM app;

    public WithdrawScreen(ATM app) {
        this.app = app;
        createScene();
    }

    private void createScene() {
        Label messageLabel = new Label("Select Amount to Withdraw");
        // Create Withdraw Screen
        Button tk500 = new Button("500 Taka");
        Button tk1000 = new Button("1000 Taka");
        Button tk2000 = new Button("2000 Taka");
        Button tk5000 = new Button("5000 Taka");
        Button tk10000 = new Button("10000 Taka");
        Button tk20000 = new Button("20000 Taka");
        Button another = new Button("Another Amount");
        Button backButton = new Button("Back");

        VBox vbox = new VBox(10, messageLabel, tk500, tk1000, tk2000, tk5000, tk10000, tk20000, backButton, another);
        vbox.setAlignment(Pos.CENTER);

        scene = new Scene(vbox, 400, 300);
    }
    public Scene getScene() {
        return scene;
    }
}

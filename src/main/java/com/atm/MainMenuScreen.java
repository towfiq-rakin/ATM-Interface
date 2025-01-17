package com.atm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainMenuScreen {
    private Scene scene;
    private ATM app;

    public MainMenuScreen(ATM app) {
        this.app = app;
        createScene();
    }

    private void createScene() {
        Button checkBalanceButton = new Button("Check Balance");
        Button depositButton = new Button("Deposit");
        Button withdrawButton = new Button("Withdraw");
        Button exitButton = new Button("Exit");

        // Button Actions
        checkBalanceButton.setOnAction(e -> {
            TransactionScreen transaction = new TransactionScreen(app, "Balance: $1000");
            app.setScene(transaction.getScene());
        });

        withdrawButton.setOnAction(e -> {
            WithdrawScreen withdrawScreen = new WithdrawScreen(app);
            app.setScene(withdrawScreen.getScene());
        });
        exitButton.setOnAction(e -> app.getPrimaryStage().close());

        VBox vbox = new VBox(10, checkBalanceButton, depositButton, withdrawButton, exitButton);
        vbox.setAlignment(Pos.CENTER);

        scene = new Scene(vbox, 400, 300);
    }

    public Scene getScene() {
        return scene;
    }
}

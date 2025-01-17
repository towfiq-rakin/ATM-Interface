package com.atm;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginScreen {
    private Scene scene;
    private ATM app;

    public LoginScreen(ATM app) {
        this.app = app;
        createScene();
    }

    private void createScene() {
        Label accountLabel = new Label("Account Number:");
        Label pinLabel = new Label("PIN:");
        TextField accountField = new TextField();
        PasswordField pinField = new PasswordField();
        Button loginButton = new Button("Login");

        // Set Login Button Action
        loginButton.setOnAction(e -> {
            String accountNo = accountField.getText();
            String pinNo = pinField.getText();
            if (accountCheck(accountNo) && pinNo.equals("1234")) {
                MainMenuScreen mainMenu = new MainMenuScreen(app);
                app.setScene(mainMenu.getScene());
            } else {
                accountField.clear();
                pinField.clear();
            }
        });

        GridPane grid = new GridPane();
        grid.add(accountLabel, 0, 0);
        grid.add(accountField, 1, 0);
        grid.add(pinLabel, 0, 1);
        grid.add(pinField, 1, 1);
        grid.add(loginButton, 1, 2);

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        scene = new Scene(grid, 400, 300);
    }

    public Scene getScene() {
        return scene;
    }

    boolean accountCheck(String visa){
        //Lunh Algorithm to check if the account number is valid
        int nDigits = visa.length();
        int nSum = 0;
        boolean isSecond = false;
        for (int i = nDigits - 1; i >= 0; i--) {
            int d = visa.charAt(i) - '0';
            if (isSecond)
                d = d * 2;
            nSum += d / 10;
            nSum += d % 10;
            isSecond = !isSecond;
        }
        return (nSum % 10 == 0);
    }
}

package com.atm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ATM extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        LoginScreen loginScreen = new LoginScreen(this);
        primaryStage.setScene(loginScreen.getScene());
        primaryStage.setTitle("ATM Interface");
        primaryStage.show();
    }

    public void setScene(Scene scene) {
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}

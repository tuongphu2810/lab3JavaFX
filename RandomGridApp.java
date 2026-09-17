package com.example.lab3javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class RandomGridApp extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 650, 650);

        stage.setTitle("Random Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
package com.example.lab3javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class RandomGridApp extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();

        GridPanel gridPanel = new GridPanel();

        AppController controller = new AppController(gridPanel);

        StackPane centerPane = new StackPane();
        centerPane.getChildren().add(gridPanel);
        centerPane.setAlignment(Pos.CENTER);

        Button redrawButton = new Button("Redraw");

        redrawButton.setOnAction(event -> controller.redraw());

        root.setCenter(centerPane);
        root.setBottom(redrawButton);

        BorderPane.setAlignment(redrawButton, Pos.CENTER);

        Scene scene = new Scene(root, 650, 650);

        stage.setTitle("Random Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

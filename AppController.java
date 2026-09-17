package com.example.lab3javafx;

public class AppController {

    GridPanel gridPanel;

    public AppController(GridPanel gridPanel) {
        this.gridPanel = gridPanel;
    }

    public void redraw() {
        gridPanel.redraw();
    }
}

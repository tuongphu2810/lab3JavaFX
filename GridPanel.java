package com.example.lab3javafx;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GridPanel extends Canvas {

    int gridSize = 10;
    int cellSize = 50;
    int canvasSize = 500;

    public GridPanel() {
        super(500, 500);
        redraw();
    }

    public void redraw() {
        drawGrid();
        drawBars();
    }

    public void drawGrid() {

        GraphicsContext gc = getGraphicsContext2D();

        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvasSize, canvasSize);

        gc.setStroke(Color.GRAY);
        gc.setLineWidth(0.5);

        for (int i = 0; i <= gridSize; i++) {

            int position = i * cellSize;

            gc.strokeLine(position, 0, position, canvasSize);
            gc.strokeLine(0, position, canvasSize, position);
        }
    }


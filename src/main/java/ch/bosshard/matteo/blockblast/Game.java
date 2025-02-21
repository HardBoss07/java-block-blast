package ch.bosshard.matteo.blockblast;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Insets;

public class Game {
    private final int GRID_SIZE = 8;
    private final int TILE_SIZE = 50;

    GridPane grid = new GridPane();
    StackPane gridContainer = new StackPane();

    private int[][] gridArray;

    public void initGame() {
        gridArray = new int[GRID_SIZE][GRID_SIZE];
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                gridArray[i][j] = (i + j) % 2;
            }
        }
        setGrid();
    }

    public void setGrid() {
        grid.getChildren().clear();
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                Rectangle tile = generateTile(gridArray[i][j]);
                grid.add(tile, j, i);
            }
        }

        gridContainer.getChildren().clear();
        gridContainer.getChildren().add(grid);
        gridContainer.setStyle("-fx-background-radius: 10; -fx-background-color: #c6c6c6; -fx-alignment: center;");
        gridContainer.setPadding(new Insets(20));
        gridContainer.setMinSize(GRID_SIZE * TILE_SIZE + 20, GRID_SIZE * TILE_SIZE + 20);
    }

    public Rectangle generateTile(int colorInt) {
        Rectangle rectangle = new Rectangle(TILE_SIZE, TILE_SIZE);
        rectangle.setArcHeight(5);
        rectangle.setArcWidth(5);
        switch (colorInt) {
            case 0:
                rectangle.setFill(Color.LIGHTGRAY);
                break;
            case 1:
                rectangle.setFill(Color.DARKGRAY);
                break;
            default:
                rectangle.setFill(Color.WHITE);
                break;
        }
        return rectangle;
    }

    public StackPane getGridContainer() {
        return gridContainer;
    }
}

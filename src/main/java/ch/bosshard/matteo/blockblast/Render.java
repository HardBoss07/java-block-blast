package ch.bosshard.matteo.blockblast;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Render {
    public static final int GRID_SIZE = 8;
    public static final int CELL_SIZE = 40;
    public static final Color[] COLOR_PALETTE = {
            Color.LIGHTGRAY, Color.DARKBLUE, Color.DARKGREEN, Color.DARKRED
    };

    private GridPane playGrid;
    private HBox blockGrid;
    private HBox header;
    private Game game;

    public Render() {
        game = new Game();
        playGrid = clearPlayGrid();
        blockGrid = initializeBlockGrid();
        header = createHeader();
    }

    public void setPlayGridWithData(int[][] data) {
        playGrid.getChildren().clear();
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                playGrid.add(createRectangle(data[i][j]), j, i);
            }
        }
    }

    private Rectangle createRectangle(int color) {
        Rectangle rec = new Rectangle(CELL_SIZE, CELL_SIZE, COLOR_PALETTE[color]);
        rec.setStroke(Color.DARKGRAY);
        rec.setStrokeWidth(1);
        return rec;
    }

    private GridPane clearPlayGrid() {
        GridPane playGrid = new GridPane();
        playGrid.setMaxWidth(CELL_SIZE * Render.GRID_SIZE);
        playGrid.setMaxHeight(CELL_SIZE * GRID_SIZE);

        for (int i = 0; i < GRID_SIZE; i++) {
            playGrid.addRow(i);
            for (int j = 0; j < GRID_SIZE; j++) {
                playGrid.addColumn(j);
                Rectangle rec = new Rectangle(CELL_SIZE, CELL_SIZE, COLOR_PALETTE[0]);
                rec.setStroke(Color.DARKGRAY);
                rec.setStrokeWidth(1);
                playGrid.add(rec, i, j);
            }
        }
        return playGrid;
    }

    private HBox initializeBlockGrid() {
        HBox blockSelection = new HBox(10);
        for (int i = 0; i < 3; i++) {
            Rectangle rec = new Rectangle(CELL_SIZE, CELL_SIZE, COLOR_PALETTE[i + 1]);
            rec.setStroke(Color.DARKGRAY);
            rec.setStrokeWidth(1);
            blockSelection.getChildren().add(rec);
        }
        return blockSelection;
    }

    private HBox createHeader() {
        HBox header= new HBox(10);

        Label scoreLabel = new Label(String.valueOf("Score: " + game.getScore()));
        Label multiplierLabel = new Label(String.valueOf("Multiplier: " + game.getMultiplier()));
        header.getChildren().addAll(scoreLabel, multiplierLabel);

        return header;
    }

    public GridPane getPlayGrid() {
        return playGrid;
    }

    public HBox getBlockGrid() {
        return blockGrid;
    }

    public HBox getHeader() {
        return header;
    }
}

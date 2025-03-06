package ch.bosshard.matteo.blockblast;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Game {
    private int GRID_SIZE;
    private int CELL_SIZE;
    private Color GRID_COLOR;
    private Color[] BLOCK_COLORS;

    private int score;
    private int multiplier;
    private GridPane playGrid;
    private HBox blockGrid;

    public Game(int GRID_SIZE, int CELL_SIZE, Color GRID_COLOR, Color[] BLOCK_COLORS) {
        this.GRID_SIZE = GRID_SIZE;
        this.CELL_SIZE = CELL_SIZE;
        this.GRID_COLOR = GRID_COLOR;
        this.BLOCK_COLORS = BLOCK_COLORS;

    }

    public void initializeGame() {
        playGrid = clearPlayGrid();
        blockGrid = initializeBlockGrid();
        this.score = 0;
        this.multiplier = 1;
    }

    private GridPane clearPlayGrid() {
        GridPane playGrid = new GridPane();
        playGrid.setMaxWidth(CELL_SIZE * GRID_SIZE);
        playGrid.setMaxHeight(CELL_SIZE * GRID_SIZE);

        for (int i = 0; i < GRID_SIZE; i++) {
            playGrid.addRow(i);
            for (int j = 0; j < GRID_SIZE; j++) {
                playGrid.addColumn(j);
                Rectangle rec = new Rectangle(CELL_SIZE, CELL_SIZE, GRID_COLOR);
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
            Rectangle rec = new Rectangle(CELL_SIZE, CELL_SIZE, BLOCK_COLORS[i]);
            rec.setStroke(Color.DARKGRAY);
            rec.setStrokeWidth(1);
            blockSelection.getChildren().add(rec);
        }
        return blockSelection;
    }

    // Getters and Setters
    public HBox getBlockGrid() {
        return blockGrid;
    }

    public void setBlockGrid(HBox blockGrid) {
        this.blockGrid = blockGrid;
    }

    public GridPane getPlayGrid() {
        return playGrid;
    }

    public void setPlayGrid(GridPane playGrid) {
        this.playGrid = playGrid;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

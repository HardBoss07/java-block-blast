package ch.bosshard.matteo.blockblast.blocks;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static ch.bosshard.matteo.blockblast.Render.CELL_SIZE;
import static ch.bosshard.matteo.blockblast.Render.COLOR_PALETTE;

public abstract class Block {
    private int[][] shape;
    private int size;

    public Block(int[][] shape) {
        this.shape = shape;
    }

    public int[][] getShape() {
        return shape;
    }

    public void addColor(int color) {
        for (int x = 0; x < shape.length; x++) {
            for (int y = 0; y < shape[x].length; y++) {
                if (shape[x][y] == 1) {
                    shape[x][y] += color;
                }
            }
        }
    }

    public GridPane createBlock() {
        GridPane grid = new GridPane();

        for (int i = 0; i < shape.length; i++) {
            grid.addRow(i);
            for (int j = 0; j < shape.length; j++) {
                grid.addColumn(j);
                if (shape[i][j] != 0) {
                    Rectangle rec = new Rectangle(CELL_SIZE, CELL_SIZE, COLOR_PALETTE[shape[i][j]]);
                    rec.setStroke(Color.DARKGRAY);
                    rec.setStrokeWidth(1);
                    grid.add(rec, j, i);
                }
            }
        }

        return grid;
    }
}

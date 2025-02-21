package ch.bosshard.matteo.blockblast.blocks;

import java.util.Random;

public abstract class Block {
    private int colorAddAmount;
    public int[][] shape;
    public String color;

    public Block() {
        Random rand = new Random();
        colorAddAmount = rand.nextInt(4);
    }

    public void rotate() {
        int size = shape.length;
        int[][] rotated = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                rotated[col][size - row - 1] = shape[row][col];
            }
        }
        shape = rotated;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return shape.length;
    }

    public abstract void createShape();
}

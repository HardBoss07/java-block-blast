package ch.bosshard.matteo.blockblast;

import static ch.bosshard.matteo.blockblast.Render.*;

public class Game {

    private int score;
    private int multiplier;

    private int[][] playArray;

    public Game() {
        initializeGame();
    }

    public void initializeGame() {
        this.score = 0;
        this.multiplier = 1;
        playArray = new int[GRID_SIZE][GRID_SIZE];
    }

    // Getters and Setters
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

    public int[][] getPlayArray() {
        return playArray;
    }

    public void setPlayArray(int[][] playArray) {
        this.playArray = playArray;
    }
}

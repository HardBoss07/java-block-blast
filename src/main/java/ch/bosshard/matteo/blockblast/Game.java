package ch.bosshard.matteo.blockblast;

import ch.bosshard.matteo.blockblast.blocks.Block;
import ch.bosshard.matteo.blockblast.blocks.LBlock;
import ch.bosshard.matteo.blockblast.blocks.SBlock;
import ch.bosshard.matteo.blockblast.blocks.TBlock;

import static ch.bosshard.matteo.blockblast.Render.*;

public class Game {

    private int score;
    private int multiplier;

    private int[][] playArray;
    private Block[] blocks;

    public Game() {
        initializeGame();
    }

    public void initializeGame() {
        this.score = 0;
        this.multiplier = 1;
        playArray = new int[GRID_SIZE][GRID_SIZE];
        Block block1 = new LBlock();
        Block block2 = new SBlock();
        block2.addColor(1);
        Block block3 = new TBlock();
        block3.addColor(2);
        blocks = new Block[] {block1, block2, block3};
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

    public Block[] getBlocks() {
        return blocks;
    }

    public void setBlocks(Block[] blocks) {
        this.blocks = blocks;
    }
}

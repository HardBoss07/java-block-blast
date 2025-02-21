package ch.bosshard.matteo.blockblast.blocks;

public class LBlock extends Block {
    public LBlock() {
        createShape();
    }

    @Override
    public void createShape() {
        shape = new int[][]{
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
    }
}

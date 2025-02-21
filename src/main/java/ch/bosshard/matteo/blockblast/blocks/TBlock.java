package ch.bosshard.matteo.blockblast.blocks;

public class TBlock extends Block {
    public TBlock() {
        createShape();
    }

    @Override
    public void createShape() {
        shape = new int[][]{
                {0, 1, 0},
                {1, 1, 1},
                {0, 0, 0}
        };
    }
}

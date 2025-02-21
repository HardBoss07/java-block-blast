package ch.bosshard.matteo.blockblast.blocks;

public class IBlock extends Block {
    public IBlock() {
        createShape();
    }

    @Override
    public void createShape() {
        shape = new int[][]{
                {1, 1, 1, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
    }
}

package tetris;

enum Shape {

    ZShape(new int[][]{{0, -1}, {0, 0}, {1, 0}, {1, 1}}),
    Square(new int[][]{{-1, -1}, {0, -1}, {-1, 0}, {0, 0}}),
    SShape(new int[][]{{0, -1}, {0, 0}, {-1, 0}, {-1, 1}}),
    TShape(new int[][]{{-2, -1}, {-1, -1}, {0, -1}, {-1, 0}}),
    Rev_LShape(new int[][]{{-1, -1}, {0, -1}, {0, 0}, {0, 1}}),
    IShape(new int[][]{{0, -1}, {0, 0}, {0, 1}, {0, 2}}),
    LShape(new int[][]{{1, -1}, {0, -1}, {0, 0}, {0, 1}});

    private Shape(int[][] shape) {
        this.shape = shape;
        pos = new int[4][2];
        reset();
    }

    void reset() {
        for(int i = 0; i < pos.length; i++) {
            pos[i] = shape[i].clone();
        }
    }

    final int[][] pos, shape;
}
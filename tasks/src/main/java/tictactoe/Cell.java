package tictactoe;

/**
 * Class implements the cell on the board
 *
 * @author e.krasnova
 */
class Cell {

    private int x = 0;
    private int y = 0;

    Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}

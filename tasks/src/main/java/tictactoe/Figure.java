package tictactoe;

import javafx.scene.shape.Rectangle;

/**
 * Class implements the figure X or O
 *
 * @author e.krasnova
 */
class Figure extends Rectangle {
    private boolean markX = false;
    private boolean markO = false;

    Figure() {
    }

    Figure(boolean markX, boolean markO) {
        this.markX = markX;
        this.markO = markO;
    }

    boolean hasMarkX() {
        return this.markX;
    }

    boolean hasMarkO() {
        return this.markO;
    }
}

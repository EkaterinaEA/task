package tictactoe;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Class that contains logic for checking the winners
 *
 * @author e.krasnova
 */
class Logic {
    private final Figure[][] table;

    Logic(Figure[][] table) {
        this.table = table;
    }

    /**
     * Method checks if the figure has filled a line
     *
     * @param predicate {@link Predicate< Figure >} - passed hasMarkX or hasMarkO
     * @param startX    - X-coordinate of the point's start position
     * @param startY    - Y-coordinate of the point's start position
     * @param deltaX    - point step along the X coordinate
     * @param deltaY    - point step along the Y coordinate
     * @return true - yes, figure fill a line, false - no, figure doesn't fill a line
     */
    private boolean fillBy(Predicate<Figure> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Method checks if this figure has filled a line (diagonals or horizontal or vertical)
     *
     * @param predicate {@link Predicate< Figure >} - passed hasMarkX or hasMarkO
     * @return true - yes, this figure fill a line, false - no, this figure doesn't fill a line
     */
    private boolean isWinner(Predicate<Figure> predicate) {
        boolean winner;

        // all diagonals
        winner = this.fillBy(predicate, this.table.length - 1, 0, -1, 1)
                || this.fillBy(predicate, 0, 0, 1, 1);

        // horizontal and vertical
        if (!winner) {
            Predicate<Integer> horizontal = (i -> this.fillBy(predicate, 0, i, 1, 0));
            Predicate<Integer> vertical = (i -> this.fillBy(predicate, i, 0, 0, 1));
            winner = IntStream.range(0, table.length).filter(i -> (horizontal.test(i) || vertical.test(i))).count() > 0;
        }
        return winner;
    }

    /**
     * Method checks if this X figure has filled a line
     *
     * @return true - yes, X figure fill a line, false - no, X figure doesn't fill a line
     */
    boolean isWinnerX() {
        return isWinner(Figure::hasMarkX);
    }

    /**
     * Method checks if this Y figure has filled a line
     *
     * @return true - yes, Y figure fill a line, false - no, Y figure doesn't fill a line
     */
    boolean isWinnerO() {
        return isWinner(Figure::hasMarkO);
    }

    /**
     * Method checks the matrix for a draw
     *
     * @return true - draw, false - not draw
     */
    boolean hasGap() {
        return !(this.table.length*this.table.length == Arrays.stream(this.table).flatMap(Arrays::stream)
                .takeWhile(s -> s.hasMarkO() || s.hasMarkX()).count());
    }
}

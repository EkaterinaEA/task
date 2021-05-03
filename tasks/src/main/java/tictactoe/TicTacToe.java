package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class that describes logic for the behavior of TicTacToe players
 *
 * @author e.krasnova
 */
class TicTacToe {

    private static List<Cell> matrixFreeCells = new ArrayList<>();
    private static boolean nextFigure = false; // true = X, false = O
    private static String result = "";
    private static StringBuilder matrixSB = new StringBuilder();

    /**
     * Method for initialing an ArrayList that stores free cells
     *
     * @param size - board/matrix size
     */
    private static void initializeArray(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixFreeCells.add(new Cell(i, j));
            }
        }
    }

    /**
     * Method for initializing an empty matrix
     *
     * @param size - board/matrix size
     * @return {@link Figure[][]} - matrix of Figure type
     */
    private static Figure[][] initializeMatrix(int size) {
        Figure[][] figure = new Figure[size][size];
        initializeArray(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                figure[i][j] = new Figure();
            }
        }
        return figure;
    }

    /**
     * Method selected a random empty space on the board
     *
     * @return {@link Cell}
     */
    private static Cell getRandomCell() {
        final int randomIndex = (int) (Math.random() * matrixFreeCells.size());
        final Cell cell = matrixFreeCells.get(randomIndex);
        matrixFreeCells.remove(randomIndex);
        return cell;
    }

    /**
     * Method for generating a random figure X or O
     *
     * @return {@link Figure}
     */
    private static Figure getRandomFigure() {
        Random rd = new Random();
        boolean randomBooleanValue = rd.nextBoolean();
        return new Figure(randomBooleanValue, !randomBooleanValue);
    }

    /**
     * Method puts one figure on the board
     *
     * @return {@link Figure}
     */
    private static Figure createAction(Figure[][] matrix) {
        Cell cell = getRandomCell();
        Figure figure = new Figure(nextFigure, !nextFigure);
        nextFigure = !nextFigure;
        matrix[cell.getX()][cell.getY()] = figure;
        return figure;
    }

    /**
     * Method create first step on the board
     *
     * @param matrix - {@link Figure[][]}, matrix of Figure type for work
     */
    private static void createFirstStep(Figure[][] matrix) {
        Cell cell = getRandomCell();
        Figure figure = getRandomFigure();
        matrix[cell.getX()][cell.getY()] = figure;
        if (figure.hasMarkX()) {
            matrixSB.append("X goes first\n");
        } else {
            matrixSB.append("O goes first\n");
            nextFigure = true;
        }
    }

    /**
     * Method puts first size figures on the board (before this time we need check winner)
     *
     * @param matrix - {@link Figure[][]}, matrix of Figure type for work
     * @param logic  {@link Logic}
     */
    private static void fillMatrixFirstSizeCells(Figure[][] matrix, Logic logic) {
        createFirstStep(matrix);
        for (int i = 0; i < matrix.length - 1; i++) {
            createAction(matrix);
        }
        if (logic.isWinnerX()) {
            result = "X won!";
        } else if (logic.isWinnerO()) {
            result = "O won!";
        }
    }

    /**
     * Method prints the matrix and result on the screen
     *
     * @param matrix - {@link Figure[][]}, matrix of Figure type for work
     * @param result - String. X won! / O won! / It was a draw
     */
    private static StringBuilder getMatrixAndResultSB(Figure[][] matrix, String result) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].hasMarkX()) {
                    matrixSB.append("X ");
                } else if (matrix[i][j].hasMarkO()) {
                    matrixSB.append("O ");
                } else {
                    matrixSB.append("# ");
                }
            }
            matrixSB.append("\n");
        }
        return matrixSB.append("\n").append(result);
    }

    /**
     * Method starts TicTacToe game
     *
     * @param size - board size
     */
    String start(int size) {
        Figure[][] matrix = initializeMatrix(size);
        Logic logic = new Logic(matrix);
        fillMatrixFirstSizeCells(matrix, logic);

        if (result.isEmpty()) {
            for (int i = 0; i < size * size - size; i++) {
                Figure figure = createAction(matrix);
                if (figure.hasMarkX()) {
                    if (logic.isWinnerX()) {
                        result = "X won!";
                        break;
                    }
                } else if (figure.hasMarkO()) {
                    if (logic.isWinnerO()) {
                        result = "O won!";
                        break;
                    }
                }
            }
        }
        if (result.isEmpty()) result = "It was a draw";
        return getMatrixAndResultSB(matrix, result).toString();
    }
}

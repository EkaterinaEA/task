package tictactoe;

import java.util.Scanner;

/**
 * Command-line program to simulate two people playing a game of a tic-tac-toe
 * args - board size
 *
 * @author e.krasnova
 */
public class Application {

    private static final TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int matrixSize = in.nextInt();
        System.out.println(ticTacToe.start(matrixSize));
    }
}


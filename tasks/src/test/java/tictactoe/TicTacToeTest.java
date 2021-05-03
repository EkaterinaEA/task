package tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TicTacToeTest {

    private static final TicTacToe ticTacToe = new TicTacToe();
    private static final String result2x2 = ticTacToe.start(2);
    private static final String result5x5 = ticTacToe.start(5);

    @Test
    public void thereIsNoDrawOnBoard2x2() {
        assertThat(result2x2.contains("It was a draw"), is(false));
    }

    @Test
    public void winnerSignPrints4TimesOnBoard2x2() {
        if (result2x2.contains("X won!")) {
            long xCount = result2x2.codePoints().filter(ch -> ch == 'X').count();
            assertThat(xCount, is(4L));
        } else {
            long yCount = result2x2.codePoints().filter(ch -> ch == 'O').count();
            assertThat(yCount, is(4L));
        }
    }

    @Test
    public void firstPlayerWinsOnBoard2x2() {
        if (result2x2.contains("X goes first")) {
            assertThat(result2x2.contains("X won!"), is(true));
        } else {
            assertThat(result2x2.contains("O won!"), is(true));
        }
    }

    @Test
    public void thereIsOneSignSharpOnBoard2x2() {
        long sharpCount = result2x2.codePoints().filter(ch -> ch == '#').count();
        assertThat(sharpCount, is(1L));
    }

    @Test
    public void checkCountFigureOnBoard5x5() {
        long xCount = result5x5.codePoints().filter(ch -> ch == 'X').count();
        long yCount = result5x5.codePoints().filter(ch -> ch == 'Y').count();
        if (result5x5.contains("It was a draw")) {
            if (result5x5.contains("X goes first")) {
                assertThat(xCount, is(13L));
                assertThat(yCount, is(12L));
            } else {
                assertThat(xCount, is(12L));
                assertThat(yCount, is(13L));
            }
        }
    }

    @Test
    public void whenDrawThenThereIsNoEmptyCell() {
        long sharpCount = result5x5.codePoints().filter(ch -> ch == '#').count();
        if (result5x5.contains("It was a draw")) {
            assertThat(sharpCount, is(0L));
        }
    }
}

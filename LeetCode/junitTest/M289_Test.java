import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M289_Test {

    M289_Game_of_Life m289 = new M289_Game_of_Life();

    @Test
    public void M289_test1() {
        int[][] board = new int[][] {   { 0, 1, 0 },
                                        { 0, 0, 1 },
                                        { 1, 1, 1 },
                                        { 0, 0, 0 }};

        int[][] expected = new int[][] {    { 0, 0, 0 },
                                            { 1, 0, 1 },
                                            { 0, 1, 1 },
                                            { 0, 1, 0 }};

        m289.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    @Test
    public void M289_test2() {
        int[][] board = new int[][] {   { 0, 0, 0 },
                                        { 0, 0, 0 },
                                        { 1, 1, 1 },
                                        { 1, 1, 1 }};

        int[][] expected = new int[][] {    { 0, 0, 0 },
                                            { 0, 1, 0 },
                                            { 1, 0, 1 },
                                            { 1, 0, 1 }};

        m289.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    @Test
    public void M289_test3() {
        int[][] board = new int[][] { {} };

        int[][] expected = new int[][] { {} };

        m289.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    @Test
    public void M289_test4() {
        int[][] board = new int[][] { { 0, 1, 0 } };

        int[][] expected = new int[][] { { 0, 0, 0 } };

        m289.gameOfLife(board);
        assertArrayEquals(expected, board);
    }
}
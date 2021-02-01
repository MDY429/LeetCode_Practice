import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */

public class H1510_Test {
    
    H1510_Stone_Game_IV h1510 = new H1510_Stone_Game_IV();

    @Test
    public void H1510_Test1() {

        assertTrue(h1510.winnerSquareGame(1));
        assertTrue(h1510.winnerSquareGame(3));
        assertTrue(h1510.winnerSquareGame(21));
        assertTrue(h1510.winnerSquareGame(99));

        assertFalse(h1510.winnerSquareGame(2));
        assertFalse(h1510.winnerSquareGame(17));
        assertFalse(h1510.winnerSquareGame(7));
        assertFalse(h1510.winnerSquareGame(57));
    }

    @Test
    public void H1510_Test2() {

        assertTrue(h1510.winnerSquareGame_recursion(1));
        assertTrue(h1510.winnerSquareGame_recursion(3));
        assertTrue(h1510.winnerSquareGame_recursion(21));
        assertTrue(h1510.winnerSquareGame_recursion(99));

        assertFalse(h1510.winnerSquareGame_recursion(2));
        assertFalse(h1510.winnerSquareGame_recursion(17));
        assertFalse(h1510.winnerSquareGame_recursion(7));
        assertFalse(h1510.winnerSquareGame_recursion(57));
    }
}

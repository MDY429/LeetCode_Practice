import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M1140_Test {

    M1140_Stone_Game_II m1140;
    int[] p1, p2, p3;

    @BeforeEach
    public void init() {
        m1140 = new M1140_Stone_Game_II();

        p1 = new int[] { 1, 1, 1, 1, 1, 1 };

        p2 = new int[] { 3, 10 };

        p3 = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10 };
    }

    @Test
    public void M1140_test1() {
        int expected = 3;
        int actual = m1140.stoneGameII(p1);
        assertEquals(expected, actual);
    }

    @Test
    public void M1140_test2() {
        int expected = 13;
        int actual = m1140.stoneGameII(p2);
        assertEquals(expected, actual);
    }

    @Test
    public void M1140_test3() {
        int expected = 8;
        int actual = m1140.stoneGameII(p3);
        assertEquals(expected, actual);
    }
}
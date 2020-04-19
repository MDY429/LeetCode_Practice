import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M96_Test {

    M96_Unique_Binary_Search_Trees m96 = new M96_Unique_Binary_Search_Trees();

    @Test
    public void M96_test1() {
        int n = 3;
        int expected = 5;
        int actual = m96.numTrees(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M96_test2() {
        int n = 0;
        int expected = 1;
        int actual = m96.numTrees(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M96_test3() {
        int n = 1;
        int expected = 1;
        int actual = m96.numTrees(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M96_test4() {
        int n = 2;
        int expected = 2;
        int actual = m96.numTrees(n);

        assertEquals(expected, actual);
    }

    @Test
    public void M96_test5() {
        int n = 7;
        int expected = 429;
        int actual = m96.numTrees(n);

        assertEquals(expected, actual);
    }
}
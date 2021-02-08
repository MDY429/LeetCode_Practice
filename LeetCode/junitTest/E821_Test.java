import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify. The permutation could be different.
 * 
 * @author MDY
 */
public class E821_Test {

    E821_Shortest_Distance_to_a_Character e821 = new E821_Shortest_Distance_to_a_Character();

    @Test
    public void E821_Test1() {
        String s = "loveleetcode";
        char c = 'e';

        int[] expected = new int[] { 3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0 };
        int[] actual = e821.shortestToChar(s, c);
        int[] actual2 = e821.shortestToChar2(s, c);
        int[] actual3 = e821.shortestToChar3(s, c);

        assertArrayEquals(expected, actual);
        assertArrayEquals(expected, actual2);
        assertArrayEquals(expected, actual3);
    }

    @Test
    public void E821_Test2() {
        String s = "aaab";
        char c = 'b';

        int[] expected = new int[] { 3, 2, 1, 0 };
        int[] actual = e821.shortestToChar(s, c);
        int[] actual2 = e821.shortestToChar2(s, c);
        int[] actual3 = e821.shortestToChar3(s, c);

        assertArrayEquals(expected, actual);
        assertArrayEquals(expected, actual2);
        assertArrayEquals(expected, actual3);
    }

    @Test
    public void E821_Test3() {
        String s = "aaab";
        char c = 'a';

        int[] expected = new int[] { 0, 0, 0, 1 };
        int[] actual = e821.shortestToChar(s, c);
        int[] actual2 = e821.shortestToChar2(s, c);
        int[] actual3 = e821.shortestToChar3(s, c);

        assertArrayEquals(expected, actual);
        assertArrayEquals(expected, actual2);
        assertArrayEquals(expected, actual3);
    }

    @Test
    public void E821_Test4() {
        String s = "aaba";
        char c = 'b';

        int[] expected = new int[] { 2, 1, 0, 1 };
        int[] actual = e821.shortestToChar(s, c);
        int[] actual2 = e821.shortestToChar2(s, c);
        int[] actual3 = e821.shortestToChar3(s, c);

        assertArrayEquals(expected, actual);
        assertArrayEquals(expected, actual2);
        assertArrayEquals(expected, actual3);
    }
}

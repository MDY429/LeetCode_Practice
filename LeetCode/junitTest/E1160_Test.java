import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E1160_Test {
    E1160_Find_Words_That_Can_Be_Formed_by_Characters e1160;
    String[] w1, w2, w3, w4;
    String c1, c2, c3, c4;

    @BeforeEach
    public void init() {
        e1160 = new E1160_Find_Words_That_Can_Be_Formed_by_Characters();

        w1 = new String[] { "hat", "cat", "dog", "int" };
        c1 = "myfirstprogramishelloword";
        w2 = new String[] { "hello", "world" };
        c2 = "waocrkldheo";
        w3 = new String[] { "a" };
        c3 = "bbbb";
        w4 = new String[] {"a", "a", "a", "a"};
        c4 = "a";
    }

    @Test
    public void E1160_test1() {
        int expected = 6;
        int actual = e1160.countCharacters(w1, c1);
        assertEquals(expected, actual);

        int actual2 = e1160.countCharacters_HashTable(w1, c1);
        assertEquals(expected, actual2);
    }

    @Test
    public void E1160_test2() {
        int expected = 5;
        int actual = e1160.countCharacters(w2, c2);
        assertEquals(expected, actual);

        int actual2 = e1160.countCharacters_HashTable(w2, c2);
        assertEquals(expected, actual2);
    }

    @Test
    public void E1160_test3() {
        int expected = 0;
        int actual = e1160.countCharacters(w3, c3);
        assertEquals(expected, actual);

        int actual2 = e1160.countCharacters_HashTable(w3, c3);
        assertEquals(expected, actual2);
    }

    @Test
    public void E1160_test4() {
        int expected = 4;
        int actual = e1160.countCharacters(w4, c4);
        assertEquals(expected, actual);

        int actual2 = e1160.countCharacters_HashTable(w4, c4);
        assertEquals(expected, actual2);
    }
}
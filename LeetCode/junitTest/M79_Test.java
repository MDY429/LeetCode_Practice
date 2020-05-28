import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M79_Test {

    M79_Word_Search m79;
    char[][] b1, b2, b3;

    @BeforeEach
    public void init() {
        m79 = new M79_Word_Search();

        b1 = new char[][] { { 'A', 'B', 'C', 'E' },
                            { 'S', 'F', 'D', 'S' },
                            { 'A', 'D', 'E', 'E' }};

        b2 = new char[][] { { 'A', 'B', 'C', 'E' },
                            { 'S', 'F', 'E', 'S' },
                            { 'A', 'D', 'E', 'E' }};

        b3 = new char[][] {};
    }

    @Test
    public void M79_test1() {

        assertTrue(m79.exist(b1, "ABCE"));
        assertTrue(m79.exist(b1, "SEE"));
        assertTrue(m79.exist(b1, "EEDA"));
        assertTrue(m79.exist(b1, "F"));
        assertTrue(m79.exist(b1, "DSEC"));
        assertTrue(m79.exist(b1, "BFDASA"));
        assertTrue(m79.exist(b1, "ABCESEEDFDAS"));

        assertFalse(m79.exist(b1, "ASASA"));
        assertFalse(m79.exist(b1, "ADEESDE"));
        assertFalse(m79.exist(b1, "AFE"));
        assertFalse(m79.exist(b1, "BCFE"));
        assertFalse(m79.exist(b1, "SFECBF"));
    }

    @Test
    public void M79_test2() {

        // Reference from LeetCode.
        assertTrue(m79.exist(b2, "ABCESEEEFS"));
        
        assertTrue(m79.exist(b2, "ABCESEEEFSA"));

        assertFalse(m79.exist(b1, "ABCESEEEFSAB"));
    }

    @Test
    public void M79_test3() {

        assertFalse(m79.exist(b3, "A"));
    }
}
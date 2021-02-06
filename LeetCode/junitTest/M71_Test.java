import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M71_Test {

    M71_Simplify_Path m71;
    String p1, p2, p3, p4, p5;

    @BeforeEach
    public void init() {
        m71 = new M71_Simplify_Path();
        p1 = "/home/";
        p2 = "/../";
        p3 = "/home//foo/";
        p4 = "/a/./b/../../c/";
        p5 = "/a/./b//../../c/d/";
    }

    @Test
    public void M71_Test1() {
        String expected = "/home";
        String actual = m71.simplifyPath(p1);
        assertEquals(expected, actual);
    }

    @Test
    public void M71_Test2() {
        String expected = "/";
        String actual = m71.simplifyPath(p2);
        assertEquals(expected, actual);
    }

    @Test
    public void M71_Test3() {
        String expected = "/home/foo";
        String actual = m71.simplifyPath(p3);
        assertEquals(expected, actual);
    }

    @Test
    public void M71_Test4() {
        String expected = "/c";
        String actual = m71.simplifyPath(p4);
        assertEquals(expected, actual);
    }

    @Test
    public void M71_Test5() {
        String expected = "/c/d";
        String actual = m71.simplifyPath(p5);
        assertEquals(expected, actual);
    }
}

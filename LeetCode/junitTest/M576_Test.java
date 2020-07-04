import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M576_Test {

    M576_Out_of_Boundary_Paths m576 = new M576_Out_of_Boundary_Paths();

    @Test
    public void M576_test1() {
        int expected = 12;
        int actual = m576.findPaths(1, 3, 3, 0, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void M576_test2() {
        int expected = 8;
        int actual = m576.findPaths(1, 3, 2, 0, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void M576_test3() {
        int expected = 0;
        int actual = m576.findPaths(50, 50, 10, 25, 25);
        assertEquals(expected, actual);
    }

    @Test
    public void M576_test4() {
        int expected = 914783380;
        int actual = m576.findPaths(8, 50, 23, 5, 26);
        assertEquals(expected, actual);
    }

    @Test
    public void M576_test5() {
        int expected = 4;
        int actual = m576.findPaths(1, 1, 1, 0, 0);
        assertEquals(expected, actual);
    }
}
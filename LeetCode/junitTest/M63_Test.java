import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M63_Test {

    M63_Unique_Paths_II m63;
    int[][] grid1, grid2, grid3, grid4;

    @BeforeEach
    public void init() {
        m63 = new M63_Unique_Paths_II();
        grid1 = new int[][] {   { 0, 0, 0 } };

        grid2 = new int[][] {   { 0, 0, 0 },
                                { 0, 1, 0 },
                                { 0, 0, 0 } };

        grid3 = new int[][] {   { 0, 0, 1 },
                                { 0, 0, 0 },
                                { 0, 0, 0 } };

        grid4 = new int[][] {   { 0, 0, 1, 0 },
                                { 0, 0, 0, 0 },
                                { 1, 0, 0, 0 },
                                { 0, 0, 0, 0 } };
    }

    @Test
    public void M63_test1() {
        int expected = 1;
        int actual = m63.uniquePathsWithObstacles(grid1);
        assertEquals(expected, actual);
    }

    @Test
    public void M63_test2() {
        int expected = 2;
        int actual = m63.uniquePathsWithObstacles(grid2);
        assertEquals(expected, actual);
    }

    @Test
    public void M63_test3() {
        int expected = 5;
        int actual = m63.uniquePathsWithObstacles(grid3);
        assertEquals(expected, actual);
    }

    @Test
    public void M63_test5() {
        int expected = 12;
        int actual = m63.uniquePathsWithObstacles(grid4);
        assertEquals(expected, actual);
    }
}
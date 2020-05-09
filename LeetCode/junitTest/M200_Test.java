import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M200_Test {
    
    M200_Number_of_Islands m200;
    char[][] grid1, grid2, grid3, grid4;

    @BeforeEach
    public void init() {
         
        m200 = new M200_Number_of_Islands();

        grid1 = new char[][] {  { '1', '1', '0', '0', '0' },
                                { '1', '1', '0', '0', '0' },
                                { '0', '0', '1', '0', '0' },
                                { '0', '0', '0', '1', '1' } };

        grid2 = new char[][] {  { '0', '1', '0', '0', '1' },
                                { '1', '1', '0', '0', '0' },
                                { '0', '0', '1', '0', '0' },
                                { '0', '0', '0', '1', '1' } };

        grid3 = new char[][] {  { '1', '0', '1', '0', '1' },
                                { '0', '1', '0', '1', '0' },
                                { '1', '0', '1', '0', '1' },
                                { '0', '1', '0', '1', '0' } };

        grid4 = new char[][] {};
    }

    @Test
    public void M200_test1() {
        int expected = 3;
        int actual = m200.numIslands(grid1);
        assertEquals(expected, actual);
    }

    @Test
    public void M200_test2() {
        int expected = 4;
        int actual = m200.numIslands(grid2);
        assertEquals(expected, actual);
    }

    @Test
    public void M200_test3() {
        int expected = 10;
        int actual = m200.numIslands(grid3);
        assertEquals(expected, actual);
    }

    @Test
    public void M200_test4() {
        int expected = 0;
        int actual = m200.numIslands(grid4);
        assertEquals(expected, actual);
    }
}
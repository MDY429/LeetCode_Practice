import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E575_Test {
    
    E575_Distribute_Candies e575 = new E575_Distribute_Candies();

    @Test
    public void E575_test1() {
        int[] candies = new int[] {1,1,2,2,3,3};
        int expected = 3;
        int actual = e575.distributeCandies(candies);
        assertEquals(expected, actual);
    }

    @Test
    public void E575_test2() {
        int[] candies = new int[] {1,2,3,1,2,3};
        int expected = 3;
        int actual = e575.distributeCandies(candies);
        assertEquals(expected, actual);
    }

    @Test
    public void E575_test3() {
        int[] candies = new int[] {1,1,1,1,1,1};
        int expected = 1;
        int actual = e575.distributeCandies(candies);
        assertEquals(expected, actual);
    }

    @Test
    public void E575_test4() {
        int[] candies = new int[] {1,7,2,3,6,4,5,4,7,8};
        int expected = 5;
        int actual = e575.distributeCandies(candies);
        assertEquals(expected, actual);
    }

    @Test
    public void E575_test5() {
        int[] candies = new int[] {-100,-100,-100,10000};
        int expected = 2;
        int actual = e575.distributeCandies(candies);
        assertEquals(expected, actual);
    }
}
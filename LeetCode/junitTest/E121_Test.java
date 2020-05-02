import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E121_Test {

    E121_Best_Time_to_Buy_and_Sell_Stock e121;
    int[] p1, p2, p3, p4, p5, p6;

    @BeforeEach
    public void init() {
        e121 = new E121_Best_Time_to_Buy_and_Sell_Stock();

        p1 = new int[] { 1, 2, 3, 4, 5 };
        p2 = new int[] { 5, 4, 3, 2, 1 };
        p3 = new int[] { 2, 4, 1 };
        p4 = new int[] { 2, 4, 1, 5 };
        p5 = new int[] { 999 };
        p6 = new int[] {};
    }

    @Test
    public void E121_test1() {
        int expected = 4;
        int actual = e121.maxProfit(p1);
        assertEquals(expected, actual);

        int actual2 = e121.maxProfit_Brute_Force(p1);
        assertEquals(expected, actual2);
    }

    @Test
    public void E121_test2() {
        int expected = 0;
        int actual = e121.maxProfit(p2);
        assertEquals(expected, actual);

        int actual2 = e121.maxProfit_Brute_Force(p2);
        assertEquals(expected, actual2);
    }

    @Test
    public void E121_test3() {
        int expected = 2;
        int actual = e121.maxProfit(p3);
        assertEquals(expected, actual);

        int actual2 = e121.maxProfit_Brute_Force(p3);
        assertEquals(expected, actual2);
    }

    @Test
    public void E121_test4() {
        int expected = 4;
        int actual = e121.maxProfit(p4);
        assertEquals(expected, actual);

        int actual2 = e121.maxProfit_Brute_Force(p4);
        assertEquals(expected, actual2);
    }

    @Test
    public void E121_test5() {
        int expected = 0;
        int actual = e121.maxProfit(p5);
        assertEquals(expected, actual);

        int actual2 = e121.maxProfit_Brute_Force(p5);
        assertEquals(expected, actual2);
    }

    @Test
    public void E121_test6() {
        int expected = 0;
        int actual = e121.maxProfit(p6);
        assertEquals(expected, actual);

        int actual2 = e121.maxProfit_Brute_Force(p6);
        assertEquals(expected, actual2);
    }

}
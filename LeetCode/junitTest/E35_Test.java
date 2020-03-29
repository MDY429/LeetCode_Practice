import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E35_Test {

    E35_Search_Insert_Position e35;
    int[] num1, num2, num3;

    @BeforeEach
    public void init() {
        e35 = new E35_Search_Insert_Position();
        num1 = new int[] { 0, 10, 15, 20, 25 };
        num2 = new int[] { 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 10, 15, 15, 15, 20, 20, 20, 20, 20 };
        num3 = new int[] {};
    }

    @Test
    public void E35_test1() {
        int target = 0;
        int expected = 0;
        int actual = e35.searchInsert(num1, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test2() {
        int target = 15;
        int expected = 2;
        int actual = e35.searchInsert(num1, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test3() {
        int target = 25;
        int expected = 4;
        int actual = e35.searchInsert(num1, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test4() {
        int target = 12;
        int expected = 2;
        int actual = e35.searchInsert(num1, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test5() {
        int target = 100;
        int expected = 5;
        int actual = e35.searchInsert(num1, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test6() {
        int target = 0;
        int expected = 0;
        int actual = e35.searchInsert(num2, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test7() {
        int target = 3;
        int expected = 4;
        int actual = e35.searchInsert(num2, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test8() {
        int target = 10;
        int expected = 11;
        int actual = e35.searchInsert(num2, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test9() {
        int target = 20;
        int expected = 15;
        int actual = e35.searchInsert(num2, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test10() {
        int target = -99;
        int expected = 0;
        int actual = e35.searchInsert(num2, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test11() {
        int target = 30;
        int expected = 20;
        int actual = e35.searchInsert(num2, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test12() {
        int target = 1;
        int expected = 4;
        int actual = e35.searchInsert(num2, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test13() {
        int target = 18;
        int expected = 15;
        int actual = e35.searchInsert(num2, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test14() {
        int target = 9999;
        int expected = 0;
        int actual = e35.searchInsert(num3, target);
        assertEquals(expected, actual);
    }

    @Test
    public void E35_test15() {
        int target = -1000000;
        int expected = 0;
        int actual = e35.searchInsert(num3, target);
        assertEquals(expected, actual);
    }
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E1342_Test {

    E1342_Number_of_Steps_to_Reduce_a_Number_to_Zero e1342 = new E1342_Number_of_Steps_to_Reduce_a_Number_to_Zero();

    @Test
    public void E1342_test1() {
        int num = 14;
        int expected = 6;
        int actual = e1342.numberOfSteps(num);
        assertEquals(expected, actual);
    }

    @Test
    public void E1342_test2() {
        int num = 16;
        int expected = 5;
        int actual = e1342.numberOfSteps(num);
        assertEquals(expected, actual);
    }

    @Test
    public void E1342_test3() {
        int num = 0;
        int expected = 0;
        int actual = e1342.numberOfSteps(num);
        assertEquals(expected, actual);
    }

    @Test
    public void E1342_test4() {
        int num = 99;
        int expected = 10;
        int actual = e1342.numberOfSteps(num);
        assertEquals(expected, actual);
    }

    @Test
    public void E1342_test5() {
        int num = 321;
        int expected = 11;
        int actual = e1342.numberOfSteps(num);
        assertEquals(expected, actual);
    }

    @Test
    public void E1342_test6() {
        int num = 100000;
        int expected = 22;
        int actual = e1342.numberOfSteps(num);
        assertEquals(expected, actual);
    }

}
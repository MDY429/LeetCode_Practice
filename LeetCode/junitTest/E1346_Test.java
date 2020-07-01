import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E1346_Test {

    E1346_Check_If_N_and_Its_Double_Exist e1346 = new E1346_Check_If_N_and_Its_Double_Exist();

    @Test
    public void E1346_test1() {
        int[] arr = new int[] { 5, 10, 6, 7, 8 };
        assertTrue(e1346.checkIfExist(arr));
    }

    @Test
    public void E1346_test2() {
        int[] arr = new int[] { 0, 0 };
        assertTrue(e1346.checkIfExist(arr));
    }

    @Test
    public void E1346_test3() {
        int[] arr = new int[] { 6, 6 };
        assertFalse(e1346.checkIfExist(arr));
    }

    @Test
    public void E1346_test4() {
        int[] arr = new int[] { 1, 3, 5, 11, 0, 4 };
        assertFalse(e1346.checkIfExist(arr));
    }

    @Test
    public void E1346_test5() {
        int[] arr = new int[] { 15, 5, 1, 4, 7, 2 };
        assertTrue(e1346.checkIfExist(arr));
    }
}
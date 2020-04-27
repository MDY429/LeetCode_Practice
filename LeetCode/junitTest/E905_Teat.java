import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify. The permutation could be different.
 * 
 * @author MDY
 */
public class E905_Teat {

    E905_Sort_Array_By_Parity e905;
    int[] n1, n2, n3, n4;

    @BeforeEach
    public void init() {
        e905 = new E905_Sort_Array_By_Parity();

        n1 = new int[] { 1, 2, 3, 4, 5, 6, 8 };
        n2 = new int[] { 1, 3, 5, 7, 2, 4, 6, 8 };
        n3 = new int[] {};
        n4 = new int[] { 2, 4, 6, 8, 1, 3, 5, 7 };
    }

    @Test
    public void E905_test1() {
        int[] expected = new int[] { 2, 4, 6, 8, 1, 3, 5 };
        int[] actual = e905.sortArrayByParity(n1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E905_test2() {
        int[] expected = new int[] { 2, 4, 6, 8, 1, 3, 5, 7 };
        int[] actual = e905.sortArrayByParity(n2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E905_test3() {
        int[] expected = new int[] { 2, 4, 6, 8, 1, 3, 5, 7 };
        int[] actual = e905.sortArrayByParity(n4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void E905_test4() {
        int[] expected = new int[] { 2, 4, 6, 8, 1, 3, 5 };
        int[] actual = e905.sortArrayByParity(n1);
        assertArrayEquals(expected, actual);
    }

}
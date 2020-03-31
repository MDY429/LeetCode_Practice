import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E67_Test {

    E67_Add_Binary e67 = new E67_Add_Binary();

    @Test
    public void E67_test1() {
        String a = "11";
        String b = "1";
        assertEquals("100", e67.addBinary(a, b));
    }

    @Test
    public void E67_test2() {
        String a = "0";
        String b = "0";
        assertEquals("0", e67.addBinary(a, b));
    }

    @Test
    public void E67_test3() {
        String a = "00000000011";
        String b = "1011";
        assertEquals("1110", e67.addBinary(a, b));
    }

    @Test
    public void E67_test4() {
        String a = "1000000";
        String b = "110";
        assertEquals("1000110", e67.addBinary(a, b));
    }

    // Follow LeetCode Test. -> cannot transfer to int to add the sum and turn back string.
    @Test
    public void E67_test5() {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
                     e67.addBinary(a, b));
    }
}
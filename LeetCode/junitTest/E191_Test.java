import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E191_Test {

    E191_Number_of_1_Bits e191 = new E191_Number_of_1_Bits();

    public int strToBin(String s) {
        int n = 0;

        if (s.length() < 32) {
            int len = 32 - s.length();
            for (int i = 0; i < len; i++) {
                s = "0" + s;
            }
        }

        for (int i = 0; i < 32; i++) {
            if (s.charAt(i) == '0') {
                continue;
            }
            n |= (s.charAt(i) - '0') << (31 - i);
        }
        return n;
    }

    @Test
    public void E190_test1() {
        int n = strToBin("00000000000000000000000000000000");
        int expected = 0;
        int actual = e191.hammingWeight(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E190_test2() {
        int n = strToBin("00000000000000000000000000000001");
        int expected = 1;
        int actual = e191.hammingWeight(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E190_test3() {
        int n = strToBin("10000000000000000000000000000001");
        int expected = 2;
        int actual = e191.hammingWeight(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E190_test4() {
        int n = strToBin("11111111111111111111111111111101");
        int expected = 31;
        int actual = e191.hammingWeight(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E190_test5() {
        int n = strToBin("11100000000000000000000000000000");
        int expected = 3;
        int actual = e191.hammingWeight(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E190_test6() {
        int n = strToBin("10000000000000001000000000000000");
        int expected = 2;
        int actual = e191.hammingWeight(n);
        assertEquals(expected, actual);
    }
}
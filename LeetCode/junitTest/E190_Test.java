import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class E190_Test {
    
    E190_Reverse_Bits e190 = new E190_Reverse_Bits();


    public int strToBin(String s){
        int n=0;

        if(s.length()<32) {
            int len = 32 - s.length();
            for(int i = 0;i<len;i++) {
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
        int actual = e190.reverseBits(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E190_test2() {
        int n = strToBin("00000000000000000000000000000001");
        int expected = -2147483648;
        int actual = e190.reverseBits(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E190_test3() {
        int n = strToBin("10000000000000000000000000000001");
        int expected = -2147483647;
        int actual = e190.reverseBits(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E190_test4() {
        int n = strToBin("11111111111111111111111111111101");
        int expected = -1073741825;
        int actual = e190.reverseBits(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E190_test5() {
        int n = strToBin("11100000000000000000000000000000");
        int expected = 7;
        int actual = e190.reverseBits(n);
        assertEquals(expected, actual);
    }

    @Test
    public void E190_test6() {
        int n = strToBin("10000000000000001000000000000000");
        int expected = 65537;
        int actual = e190.reverseBits(n);
        assertEquals(expected, actual);
    }
}
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M93_Test {

    M93_Restore_IP_Addresses m93 = new M93_Restore_IP_Addresses();

    @Test
    public void M93_test1() {
        String s = "25525511135";
        List<String> expected = new ArrayList<>(Arrays.asList("255.255.11.135", "255.255.111.35"));
        List<String> actual = m93.restoreIpAddresses(s);

        assertEquals(expected, actual);
    }

    @Test
    public void M93_test2() {
        String s = "1111";
        List<String> expected = new ArrayList<>(Arrays.asList("1.1.1.1"));
        List<String> actual = m93.restoreIpAddresses(s);

        assertEquals(expected, actual);
    }

    @Test
    public void M93_test3() {
        String s = "11111";
        List<String> expected = new ArrayList<>(Arrays.asList("1.1.1.11", "1.1.11.1", "1.11.1.1", "11.1.1.1"));
        List<String> actual = m93.restoreIpAddresses(s);

        assertEquals(expected, actual);
    }

    @Test
    public void M93_test4() {
        String s = "111";
        List<String> expected = new ArrayList<>();
        List<String> actual = m93.restoreIpAddresses(s);

        assertEquals(expected, actual);
    }

    @Test
    public void M93_test5() {
        String s = "1111111111111";
        List<String> expected = new ArrayList<>();
        List<String> actual = m93.restoreIpAddresses(s);

        assertEquals(expected, actual);
    }

    @Test
    public void M93_test6() {
        String s = "6540123";
        List<String> expected = new ArrayList<>(
                Arrays.asList("6.5.40.123", "6.54.0.123", "65.4.0.123", "65.40.1.23", "65.40.12.3"));
        List<String> actual = m93.restoreIpAddresses(s);

        assertEquals(expected, actual);
    }
}
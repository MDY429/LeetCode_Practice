import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Use JUnit to make the verify.
 * 
 * @author MDY
 */
public class M1529_Test {
    
    M1529_Bulb_Switcher_IV m1529 = new M1529_Bulb_Switcher_IV();

    @Test
    public void M1529_Test1() {
        String target = "10111";
        int expected = 3;
        int actual = m1529.minFlips(target);

        assertEquals(expected, actual);
    }

    @Test
    public void M1529_Test2() {
        String target = "00000";
        int expected = 0;
        int actual = m1529.minFlips(target);

        assertEquals(expected, actual);
    }

    @Test
    public void M1529_Test3() {
        String target = "001001";
        int expected = 3;
        int actual = m1529.minFlips(target);

        assertEquals(expected, actual);
    }

    @Test
    public void M1529_Test4() {
        String target = "10101010100110101101000011";
        int expected = 19;
        int actual = m1529.minFlips(target);

        assertEquals(expected, actual);
    }

}

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
public class M438_Test {
    M438_Find_All_Anagrams_in_a_String m438 = new M438_Find_All_Anagrams_in_a_String();

    @Test
    public void test1() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 6));
        List<Integer> actual = m438.findAnagrams(s, p);

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String s = "aaabbbb";
        String p = "ab";
        List<Integer> expected = new ArrayList<>(Arrays.asList(2));
        List<Integer> actual = m438.findAnagrams(s, p);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String s = "aaabbb";
        String p = "aa";
        List<Integer> expected = new ArrayList<>(Arrays.asList(0,1));
        List<Integer> actual = m438.findAnagrams(s, p);

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String s = "bbbaaa";
        String p = "aaabbb";
        List<Integer> expected = new ArrayList<>(Arrays.asList(0));
        List<Integer> actual = m438.findAnagrams(s, p);

        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String s = "aaabbbb";
        String p = "aaaa";
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = m438.findAnagrams(s, p);

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String s = "";
        String p = "a";
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = m438.findAnagrams(s, p);

        assertEquals(expected, actual);
    }
}
import java.util.ArrayList;
import java.util.List;

/**
 * url: https://leetcode.com/problems/restore-ip-addresses/
 * 
 * Given a string containing only digits, restore it by returning all possible
 * valid IP address combinations.
 * 
 * A valid IP address consists of exactly four integers (each integer is between
 * 0 and 255) separated by single points.
 * 
 * Example:
 * 
 * Input: "25525511135" Output: ["255.255.11.135", "255.255.111.35"]
 */
public class M93_Restore_IP_Addresses {

    /**
     * Find the possible IP address.
     * 
     * @param s The input of String
     * @return List of String
     */
    public List<String> restoreIpAddresses(String s) {

        List<String> ans = new ArrayList<>();

        doRestore(ans, s, "", 0);

        return ans;
    }

    /**
     * Use recursion to find the possible combination.
     * 
     * @param ans     The answer list.
     * @param s       The input of String
     * @param path    The new combine String
     * @param section The IP section
     */
    private void doRestore(List<String> ans, String s, String path, int section) {

        if (s.length() == 0 || section == 4) {
            if (s.length() == 0 && section == 4) {
                // Go through whole string and the section is 4.
                ans.add(path.substring(1));
            }
            return;
        }

        // The section can be "0", but "0" leading. e.g "01"
        int noZero = s.charAt(0) == '0' ? 1 : 3;
        for (int i = 1; i <= noZero && i <= s.length(); i++) {
            String partial = s.substring(0, i);
            if (Integer.valueOf(partial) <= 255) {
                doRestore(ans, s.substring(i), path + "." + partial, section + 1);
            }
        }

    }

    public static void main(String[] args) {
        M93_Restore_IP_Addresses m93 = new M93_Restore_IP_Addresses();

        String s = "25525511135";
        System.out.println(m93.restoreIpAddresses(s));
    }
}
/**
 * url: https://leetcode.com/problems/first-bad-version/
 * 
 * You are a product manager and currently leading a team to develop a new
 * product. Unfortunately, the latest version of your product fails the quality
 * check. Since each version is developed based on the previous version, all the
 * versions after a bad version are also bad.
 * 
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first
 * bad one, which causes all the following ones to be bad.
 * 
 * You are given an API bool isBadVersion(version) which will return whether
 * version is bad. Implement a function to find the first bad version. You
 * should minimize the number of calls to the API.
 * 
 * Example:
 * 
 * Given n = 5, and version = 4 is the first bad version.
 * 
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * 
 * Then 4 is the first bad version.
 */
public class E278_First_Bad_Version extends VersionControl{

    public E278_First_Bad_Version(int badVersion) {
        super(badVersion);
    }

    /**
     * Use binary search and iterator to find the bad version, use left and right
     * edge to track wether is bad version.
     * 
     * @param n The total version.
     * @return  The first bad version.
     */
    public int firstBadVersion(int n) {

        int l = 1;
        int r = n;

        while (l < r) {

            // Should avoid overflow if r is the maximum value.
            // int mid = (l + r) / 2;
            int mid = l + (r - l) / 2;

            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        E278_First_Bad_Version e278 = new E278_First_Bad_Version(4);
        int n = 10;
        System.out.println(e278.firstBadVersion(n));
    }

}

/**
 * Create a version control class.
 */
class VersionControl {

    private int badVersion;

    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int version) {
        if (version >= this.badVersion) {
            return true;
        }
        return false;
    }
}
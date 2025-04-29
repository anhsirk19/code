package Strings;

public class StringRotations {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(areRotations(s1, s2));
    }

    // tc is o(n*m)
    // sc is o(n)
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s1;
        return temp.contains(s2);
    }

    // Function to check if two strings are rotations of each other or not.
    //tc is o(n)
    //sc is o(n)
    public static boolean areRotations1(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s1;

        // .contains uses .indeOf, which tc is o(m*n)
        // return temp.contains(s2);
        // so use kmp for linear time searching

        return kmp(temp, s2);

    }

    static boolean kmp(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        int[] lps = new int[m];
        fillLps(pat, lps, m);
        int j = -1;
        int i = 0;
        while (i < n && j < m - 1) {
            if (txt.charAt(i) == pat.charAt(j + 1)) {
                i++;
                j++;
                if (j == m - 1) {
                    return true;
                }
            } else {
                if (j == -1) {
                    i++;
                } else {
                    j = lps[j] - 1;
                }
            }
        }
        return false;
    }

    static void fillLps(String pat, int[] lps, int m) {
        lps[0] = 0;
        int len = 0;
        int i = 1;
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                lps[i++] = ++len;
            } else {
                if (len == 0) {
                    lps[i++] = 0;
                } else {
                    len = lps[len - 1];
                }
            }
        }
    }

    // this only satisfy when the strings has distinct characters
    // tc is o(n)
    // sc is o(1)
    public static boolean areRotations9(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        int n = s1.length();
        char firstChar = s1.charAt(0);
        int t = -1;
        for (int i = 0; i < n; i++) {
            if (s2.charAt(i) == firstChar) {
                t = i;
                break;
            }
        }
        if (t == -1) {
            return false;
        }
        int i = 0;
        for (i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt((i + t) % n)) {
                return false;
            }
        }
        return true;
    }

}

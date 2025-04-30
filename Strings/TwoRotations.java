package Strings;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Strings/problem/check-if-string-is-rotated-by-two-places-1587115620
//Given two strings s1 and s2. Return true if the string s2 can be obtained by 
//rotating (in any direction) string s1 by exactly 2 places, otherwise, false.

//Note: Both rotations should be performed in same direction chosen initially.
public class TwoRotations {
    public static void main(String[] args) {
        String s1 = "amazon"; 
        String s2 = "azonam";
        System.out.println(isRotated(s1, s2));
    }
    //tc is o(n)
    //sc is o(1)
    public static boolean isRotated(String s1, String s2) {
        // Your code here
        if(s1.length() != s2.length()){
            return false;
        }
        int n = s1.length();
        int c1 = 0,c2 = 0;
        for(int i = 0 ; i < n ; i++){
            if(s1.charAt(i) == s2.charAt((i+2)%n)){
                c1++;
            }
            if(s1.charAt(i) == s2.charAt(((i-2)%n + n)%n)){
                c2++;
            }
        }
        if(c1 == n || c2 == n){
            return true;
        }
        return false;
    }
}

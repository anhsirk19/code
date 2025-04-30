package Strings;

import java.util.HashMap;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Strings/problem/isomorphic-strings-1587115620

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "aab", s2 = "xxy";
        System.out.println(areIsomorphic(s1, s2));
    }
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {
        // Your code here
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        
        for(int i = 0 ; i < s1.length() ; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if(map1.containsKey(ch1) && map1.get(ch1) != ch2){
                return false;
            }
            if(map2.containsKey(ch2) && map2.get(ch2) != ch1){
                return false;
            }
            
            map1.put(ch1, ch2);
            map2.put(ch2, ch1);
        }
        return true;
    }
}

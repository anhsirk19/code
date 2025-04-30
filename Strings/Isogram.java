package Strings;

import java.util.HashSet;

//Given a string S of lowercase alphabets, check if it is isogram or not. 
//An Isogram is a string in which no letter occurs more than once.

public class Isogram {
    public static void main(String[] args) {
        String S = "machine";
        System.out.println(isIsogram(S));
    }
    static boolean isIsogram(String data) {
        // Your code here
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0 ; i < data.length() ; i++){
            char ch = data.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}

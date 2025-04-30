package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramSearch {
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "frog";
        System.out.println(isPresent1(txt, pat));
    }
    //tc is o(n*m)
    //sc is o(m)

    static boolean isPresent(String txt, String pat){
        int n = txt.length();
        int m = pat.length();
        for(int i = 0 ; i <= n-m ; i++){
            if(isAnagram(txt, pat, i)){
                return true;
            }
        }
        return false;
    }
    
    static boolean isAnagram(String s1, String s2, int k){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s2.length() ; i++){
            map.put(s1.charAt(i+k), map.getOrDefault(s1.charAt(i+k), 0) + 1);
        }
        for(int i = 0 ; i < s2.length() ; i++){
            char key = s2.charAt(i);
            if(!map.containsKey(key)){
                return false;
            }
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
            if(map.get(key) == 0){
                map.remove(key);
            }
        }
        return map.isEmpty();
    }
    //tc is o(n * CHAR)
    //sc is o(CHAR)
    static final int CHAR = 256;
    static boolean isPresent1(String s1, String s2){
        char[] text = new char[CHAR];
        char[] pat = new char[CHAR];
        int m = s2.length();int n = s1.length();
        for(int i = 0 ; i < m ; i++){
            text[s1.charAt(i)]++;
            pat[s2.charAt(i)]++;
        }
        for(int i = m ; i < n ; i++){
            if(Arrays.equals(text, pat)){
                return true;
            }
            text[s1.charAt(i)]++;
            text[s1.charAt(i-m)]--;
        }
        if(Arrays.equals(text, pat)){
            return true;
        }
        return false;
    }
}

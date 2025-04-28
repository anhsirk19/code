package Strings;

import java.util.HashMap;
import java.util.HashSet;

//q
////q
//given a string, find the first repeated character in it.

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(solution1(s));
        System.out.println(solution2(s));
    }
    //tc is o(n)
    //sc is o(N)
    static char solution(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < s.length() ; i++){
            if(map.containsKey(s.charAt(i))){
                min = Math.min(min, map.get(s.charAt(i)));
            }else{
                map.put(s.charAt(i), i);
            }
        }
        return s.charAt(min);
    }
    //first repeating character , is equal to last repeating character from end
    //tc & sc is o(n)
    static char solution1(String s){
        HashSet<Character> set = new HashSet<>();
        char ans = '0';
        for(int i = s.length() - 1 ; i >= 0; i--){
            if(!set.contains(s.charAt(i))){
                ans = s.charAt(i);
            }else{
                set.add(s.charAt(i));
            }
        }
        return ans;
    }

    static final int CHAR = 256;
    //tc is o(n)
    //sc is o(1)
    //this method is only for No (only ASCII/Latin-1 characters properly)
    static char solution2(String s){
        int[] arr = new int[CHAR];
        char ans = '0';
        for(int i = s.length()-1 ; i >= 0 ; i--){
            if(arr[s.charAt(i)] != 0){
                ans = s.charAt(i);
            }else{
                arr[s.charAt(i)]++;
            }
        }
        return ans;
    }
}

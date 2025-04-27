package Strings;

import java.util.Arrays;
import java.util.HashMap;

//q
//check if the strings are anagrams or not

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "llohe";
        System.out.println(answer1(s1, s2));
    }
    //using sorting
    //tc is o(nlogn)
    //sc is o(n)
    static boolean answer(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] s11 = s1.toCharArray();
        char[] s12 = s2.toCharArray();
        Arrays.sort(s11);
        Arrays.sort(s12);
        return (new String(s11)).equals(new String(s12));
    }
    //using hashMap
    //tc is o(n)
    //sc is o(n), here 2 hashmaps are used, 2 loops
    static boolean answer1(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0 ; i < s1.length() ; i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        for(Character key : map1.keySet()){
            if(map1.get(key) != map2.get(key)){
                return false;
            }
        }
        return true;
    }
    //using hashMap
    //tc is o(n)
    //sc is o(n), here 1 hashmaps are used, 2 loops
    static boolean answer2(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < s1.length() ; i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
        }
        //iterating over all keys
        for(Character key : map.keySet()){
            if(map.get(key) != 0){
                return false;
            }
        }
        return true;
    }
    //using hashMap
    //tc is o(n)
    //sc is o(n), here 1 hashmaps are used, 1 loops
    static boolean answer3(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < s1.length() ; i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
            if(map.get(s2.charAt(i)) == 0){
                map.remove(s2.charAt(i));
            }
        }
        if(map.isEmpty()){
            return true;
        }
        return false;
    }
}

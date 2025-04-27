package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        String str = "abacus";
        answer2(str);
    }

    //using sorting
    //tc is o(nlogn)
    //sc is o(n), n = length of string
    static void answer(String s){
        char[] ans = s.toCharArray();
        Arrays.sort(ans);
        int count = 1;
        char prev = ans[0];
        for(int i = 1 ; i < ans.length; i++){
            if(ans[i] == prev){
                count++;
            }else{
                System.out.println(prev + " -> " + count);
                prev = ans[i];
                count = 1;
            }
        }
        System.out.println(prev + " -> " + count);
    }
    //using hashmap
    //tc is o(n)
    //sc is o(n)
    static void answer1(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> set : map.entrySet()){
            System.out.println(set.getKey() + " -> " + set.getValue());
        } 
    }
    //using dat, direct address table
    //tc is o(n)
    //sc is o(1)
    static void answer2(String s){
        int[] table = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            table[s.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(table[i] > 0){
                System.out.println((char)(i + 'a') + " -> "  + table[i]);
            }
        }
    }
}

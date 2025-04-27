package Strings;

import java.util.HashMap;

//q
//Longest String W/o repeating characters: 
public class LongestSubStr {
    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        System.out.println(solution(s));
    }
    //tc is o(n)
    //sc is o(n)
    static int solution(String s){
        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= start){
                start = map.get(s.charAt(i)) + 1;
            }else{
                map.put(s.charAt(i), i);
                maxLength = Math.max(i - start + 1, maxLength);
            }
        }
        return maxLength;
    }
}

package Strings;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(solution(s));
    }
    //tc is o(n), here loop runs two times
    //sc is o(n)
    static char solution(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }
        return '0';
    }
}

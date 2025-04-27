package Strings;

import java.util.HashSet;

//q
//given a string, find the first repeated character in it, we need to find the
//char that occurs more than once and whose index of second occ is smallest

public class RepeatingChar {
    public static void main(String[] args) {
        System.out.println(solution("geeksforgeeks"));
    }
    //tc is o(n)
    //sc is o(n)
    static char solution(String s){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(set.contains(s.charAt(i))){
                return s.charAt(i);
            }else{
                set.add(s.charAt(i));
            }
        }
        return '0';
    }
}

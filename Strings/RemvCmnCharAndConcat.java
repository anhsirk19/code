package Strings;

import java.util.HashSet;

public class RemvCmnCharAndConcat {
    public static void main(String[] args) {
        String s1 = "aacdb";
        String s2 = "gafd";
        System.out.println(concatenatedString(s1, s2));
    }
    //tc is o(n + m)
    //sc is o(n + m)

    public static String concatenatedString(String s1, String s2) {
        // Your code here
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> commonSet = new HashSet<>();
        for(int i = 0 ; i < s1.length() ; i++){
            set.add(s1.charAt(i));
        }
        for(int i = 0 ; i < s2.length() ; i++){
            if(set.contains(s2.charAt(i))){
                commonSet.add(s2.charAt(i));
            }
        }
        //we have common ele in commonSet
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            if(!commonSet.contains(ch)){
                sb.append(ch);
            }
        }
        for(int i = 0 ; i < s2.length() ; i++){
            char ch = s2.charAt(i);
            if(!commonSet.contains(ch)){
                sb.append(ch);
            }
        }
        if(sb.length() == 0){
            System.out.print("-1");
        }
        return sb.toString();
    }
}

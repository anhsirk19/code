package StackQ;
import java.util.Stack;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Stack/problem/removing-consecutive-duplicates-2-1587115621

public class Removingconsecutiveduplicates2 {
    public static void main(String[] args) {
        String s = "aaabbaaccd";
        System.out.println(removePair(s));
    }

    public static String removePair(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            System.out.println(ch);
            if(st.isEmpty()){
                st.push(ch);
            }
            if(ch == st.peek()){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
}

package StackQ;

import java.util.Stack;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Stack/problem/removing-consecutive-duplicates-1587115621

public class Removingconsecutiveduplicates {
    public static void main(String[] args) {

    }

    //tc is o(2*n)
    //sc is O(2*n)
    // Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String s) {
        // Your code here
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (st.isEmpty()) {
                st.push(ch);
            }
            if (ch != st.peek()) {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
    }

}

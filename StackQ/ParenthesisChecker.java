package StackQ;

import java.util.Stack;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Stack/problem/parenthesis-checker2744

public class ParenthesisChecker {
    public static void main(String[] args) {
        
    }

    //tc is o(n)
    //sc is (n), for stack
    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if(isMatching(st.peek(), ch)){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    static boolean isMatching(char ch1, char ch2){
        if((ch1 == '(' && ch2 == ')') || (ch1 == '{' && ch2 == '}' ) || (ch1 == '[' && ch2 == ']')){
            return true;
        }
        return false;
    }
}

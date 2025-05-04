package StackQ;

import java.util.Stack;

public class DeleteMidofaStack{
    public static void main(String[] args) {
        
    }

    // Function to delete middle element of a stack.
    //tc is o(n)
    //sc is o(n), explicitly creating another stack of size(n/2)
    public void deleteMid(Stack<Integer> s) {
        int mid = (int) Math.floor(s.size()/2) + 1;
        Stack<Integer> s1 = new Stack<>();
        while(mid != 0){
            s1.push(s.pop());
            mid--;
        }
        s1.pop();
        while(!s1.isEmpty()){
            s.push(s1.pop());
        }
    }

    //using recursion
    //tc is o(n)
    //sc is o(n), implicit due to recursion, no extra explicit stack
    public void deleteMid1(Stack<Integer> s) {
        // code here
        int mid = (int) Math.floor(s.size()/2) + 1;
        helper(s, mid);
    }
    public void helper(Stack<Integer> s, int m){
        if(m == 1){
            s.pop();
            return;
        }
        int temp = s.pop();
        helper(s, m-1);
        s.push(temp);
    }
}
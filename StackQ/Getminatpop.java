package StackQ;

import java.util.Stack;
//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Stack/problem/get-min-at-pop

public class Getminatpop {
    public static void main(String[] args) {

    }

    // Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[], int n) {
        // your code here
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            s.push(arr[i]);
        }
        return s;
    }

    // Function to print minimum value in stack each time while popping.
    // tc is o(n^2)
    static void _getMinAtPop(Stack<Integer> s) {

        // your code here
        while (s.isEmpty() == false) {
            int min = Integer.MAX_VALUE;
            for (int ele : s) {
                if (ele < min) {
                    min = ele;
                }
            }
            System.out.print(min + " ");
            s.pop();
        }
    }

    // Function to push all the elements into the stack.
    public static Stack<Integer> _push1(int arr[], int n) {
        // your code here
        Stack<Integer> minStack = new Stack<>();
        int min = arr[0];
        minStack.push(min);
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            minStack.push(min);
        }
        return minStack;
    }

    // Function to print minimum value in stack each time while popping.
    //tc is o(n)
    //sc is o(n)
    
    static void _getMinAtPop1(Stack<Integer> s) {

        // your code here
        while (s.isEmpty() == false) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}

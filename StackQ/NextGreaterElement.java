package StackQ;

import java.util.ArrayList;
import java.util.Stack;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Stack/problem/next-larger-element-1587115620

public class NextGreaterElement {
    public static void main(String[] args) {
        
    }

    //refer to stock span problem
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(arr[arr.length-1]);
        list.add(-1);
        for(int i = arr.length-2 ; i >= 0 ; i--){
            while(s.isEmpty() == false && arr[i] >= s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                list.add(0,-1);
            }else{
                list.add(0,s.peek());
            }
            s.push(arr[i]);
        }
        return list;
    }
}

package StackQ;

import java.util.ArrayList;
import java.util.Stack;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Stack/problem/stock-span-problem-1587115621

public class Stockspanproblem {
    public static void main(String[] args){

    }

    //tc is o(n)
    //sc is o(n)
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(0);// stack is used to store the indexes of pre grater element
        list.add(1);
        for(int i = 1 ; i < arr.length ; i++){
            while(s.isEmpty() == false && arr[i] >= arr[s.peek()]){//if curr ele is greter than prev, we pop the prev
                s.pop();
            }
            if(s.isEmpty()){
                list.add(i+1);
            }else{
                list.add(i-s.peek());
            }
            s.push(i);
        }
        return list;
    }
}

package StackQ;

import java.util.Stack;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Stack/article/NjkyMQ%3D%3D

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 10, 4, 2, 20, 40, 12, 30 };
        solution(arr);
    }

    //similar to stack span problem
    //tc is o(n). sc is o(n)
    
    static void solution(int[] arr){
        Stack<Integer> s = new Stack<>();
        System.out.print("-1 ");
        s.push(arr[0]);
        for(int i = 1 ; i < arr.length ; i++){
            while(s.isEmpty() == false && arr[i] >= s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print("-1 ");
            }else{
                System.out.print(s.peek() + " ");
            }
            s.push(arr[i]);
        }
    }
}

package StackQ;

import java.util.Arrays;
import java.util.Stack;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Stack/problem/maximum-rectangular-area-in-a-histogram-1587115620

public class HistogramMaxRectangularArea {
    public static void main(String[] args) {
        int[] arr = { 60,20,50,40,10,50,60};
        System.out.println(getMaxArea1(arr));
    }

    //tc is o(n^2)
    //sc is o(1)
    public static int getMaxArea(int arr[]) {
        int maxArea = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int currArea = arr[i];
            for(int j = i-1 ; j >= 0 ; j--){
                if(arr[i] <= arr[j]){
                    currArea += arr[i];
                }else{
                    break;
                }
            }
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] <= arr[j]){
                    currArea += arr[i];
                }else{
                    break;
                }
            }
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }

    //tc is o(n)
    //sc is o(n)
    public static int getMaxArea1(int arr[]) {
        int maxArea = 0;
        int n = arr.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        Stack<Integer> s1 = new Stack<>();
        //stack is used to store the prevsmaller ele index
        for(int i = 0 ; i < n ; i++){
            while(s1.isEmpty() == false && arr[i] <= arr[s1.peek()]){
                s1.pop();
            }
            if(s1.isEmpty()){
                arr1[i] = -1;
            }else{
                arr1[i] = s1.peek();
            }
            s1.push(i);
        }
        //empty the prev stack and use it
        while(s1.isEmpty() == false){
            s1.pop();
        }
    
        //stack is used to store the nextsmaller ele index
        for(int i = n-1 ; i >= 0 ; i--){
            while(s1.isEmpty() == false && arr[i] <= arr[s1.peek()]){
                s1.pop();
            }
            if(s1.isEmpty()){
                arr2[i] = n;
            }else{
                arr2[i] = s1.peek();
            }
            s1.push(i);
        }
        for(int i = 0 ; i < n ; i++){
            int currEle = arr[i];
            maxArea = Math.max((arr2[i] - arr1[i] - 1)*currEle, maxArea);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        return maxArea;
    }
}

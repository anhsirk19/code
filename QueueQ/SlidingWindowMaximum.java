package QueueQ;

import java.util.Queue;
import java.util.ArrayDeque;
//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Queue/article/MjYwNQ%3D%3D

//Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        //Output : 3 3 4 5 5 5 6
        solution(arr, k);
    }

    static void solution(int[] arr, int k){
        int n = arr.length;
        if(k > n){
            System.out.println("not");
            return;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0 ; i < k ; i++){
            while(!q.isEmpty() && arr[i] >= arr[q.peek()]){//if prev are smaller remove them
                q.poll();
            }
            q.offer(i);
        }

        for(int i = k ; i < n ; i++){
            //print max in prev window
            System.out.print(arr[q.peek()] + " ");

            //now remove the ele which are not included in this windoe
            while(!q.isEmpty() && q.peek() <= i-k){
                q.poll();
            }

            while(!q.isEmpty() && arr[i] >= arr[q.peek()]){//if prev are smaller remove them
                q.poll();
            }
            q.offer(i);
        }
        System.out.print(arr[q.peek()]);
    }
}

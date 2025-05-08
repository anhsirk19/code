package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Deque/article/NzEyMQ%3D%3D

//Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3 
//Output: 3 3 4 5 5 5 6
public class MaximumsofallsubarraysofsizeK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int K = 3;
        solution(arr, K);
    }

    public static void solution(int[] arr, int k) {
        Deque<Integer> q = new ArrayDeque<>();

        for(int i = 0 ; i < k ; i++){
            while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]){
                q.pollLast();
            }
            q.offerLast(i);
        }

        for(int i = k ; i < arr.length ; i++){
            System.out.print(arr[q.peekFirst()] + " ");

            while(!q.isEmpty() && q.peekFirst() <= i-k){
                q.pollFirst();
            }

            while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]){
                q.pollLast();
            }
            q.offerLast(i);
        }
        System.out.print(arr[q.peekFirst()] );
    }
}

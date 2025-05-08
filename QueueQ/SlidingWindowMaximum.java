package QueueQ;

import java.util.ArrayDeque;
//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Queue/article/MjYwNQ%3D%3D

//Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.

import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        solution(arr, k);
    }

    static void solution(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            System.out.println("not");
            return;
        }
        Deque<Integer> dq = new ArrayDeque<>();
        
        // Process first window
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }

        // Process rest of the array
        for (int i = k; i < n; i++) {
            // Print max of previous window
            System.out.print(arr[dq.peekFirst()] + " ");

            // Remove indices out of current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements in current window
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.offerLast(i);
        }
        // Print max of last window
        System.out.print(arr[dq.peekFirst()]);
    }
}

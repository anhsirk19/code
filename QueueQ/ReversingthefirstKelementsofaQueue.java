package QueueQ;

import java.util.Arrays;
import java.util.LinkedList;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Queue/article/MjYwNQ%3D%3D

import java.util.Queue;
import java.util.Stack;

public class ReversingthefirstKelementsofaQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        int k = 5;
        solution(q, k);
        //ans should be Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
        for(int ele : q){
            System.out.print(ele + " ");
        }
    }
    static void solution(Queue<Integer> q, int k){
        //place first k ele in queue into the stack
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i < k ; i++){
            s.push(q.poll());
        }
        //add stack ele to queue
        for(int i = 0 ; i < k ;i++){
            q.offer(s.pop());
        }
        //now add qsize - k ele to last of queue
        for(int i = 0 ; i < q.size() - k ; i++){
            q.offer(q.poll());
        }
    }
}

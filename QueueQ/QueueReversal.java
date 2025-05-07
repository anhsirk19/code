package QueueQ;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//reverse a queue
public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        solution1(q);
        for(int ele : q){
            System.out.print(ele + " ");
        }
    }

    static void solution(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.offer(s.pop());
        }
    }

    static void solution1(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int val = q.peek();
        q.poll();
        solution(q);
        q.offer(val);
    }
}
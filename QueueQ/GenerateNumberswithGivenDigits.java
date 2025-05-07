package QueueQ;

import java.util.ArrayDeque;
import java.util.Queue;

//given a number n, print first n numbers in increasing oreder with having digits in set{2,3}

public class GenerateNumberswithGivenDigits {
    public static void main(String[] args) {
        int n = 100;
        Queue<String> q = new ArrayDeque<>();
        //set {2,3}
        q.offer("2");
        q.offer("3");
        for(int i = 0 ; i < n ; i++){
            String curr = q.poll();
            System.out.print(curr + ", ");
            q.offer(curr + "2");
            q.offer(curr + "3");
        }
    }
}

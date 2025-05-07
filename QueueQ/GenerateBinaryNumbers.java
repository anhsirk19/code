package QueueQ;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        
    }

    // Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new ArrayDeque<>();
        q.offer("1");
        for(int i = 0 ; i < n ; i++){
            String curr = q.poll();
            ans.add(curr);
            q.offer(curr + "0");
            q.offer(curr + "1");
        }
        return ans;
    }
}

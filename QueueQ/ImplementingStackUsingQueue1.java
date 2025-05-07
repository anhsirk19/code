package QueueQ;

import java.util.Queue;
import java.util.ArrayDeque;

//implementing stack using two queues
public class ImplementingStackUsingQueue1 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek: " + s.peek()); // 3
        System.out.println("Pop: " + s.pop()); // 3
        System.out.println("Pop: " + s.pop()); // 2
        System.out.println("Size: " + s.size()); // 1
    }
}

// push : o(n)
// pop : O(1)
// it is also called pushHeavyStack
class Stack {
    int size;
    Queue<Integer> q1;
    Queue<Integer> q2;

    Stack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
        size = 0;
    }

    // isempty
    public boolean isEmpty() {
        return size == 0;
    }

    // size
    public int size() {
        return size;
    }

    // push
    public void push(int x) {
        // push x to the empty q2

        q2.offer(x);
        // Push all the remaining
        // elements in q1 to q2.
        while (q1.isEmpty() == false) {
            q2.offer(q1.poll());
        }
        size++;

        //// swap the names of two queues
        Queue<Integer> qTemp = q1;
        q1 = q2;
        q2 = qTemp;
    }

    // pop
    public int pop() {
        if (q1.isEmpty()) {
            System.out.print("stack is empty");
            return -1;
        }
        size--;
        return q1.poll();
    }

    // peek
    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        return q1.peek();
    }
}

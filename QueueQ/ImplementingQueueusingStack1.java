package QueueQ;

import java.util.Stack;

public class ImplementingQueueusingStack1 {
    public static void main(String[] args) {
        
    }
}

//cheap enqueue, costly dequeue(prefered method)
//similary like stack using queue we can also sove this using one stack using reccursion

class Queue{
    Stack<Integer> s1;
    Stack<Integer> s2;
    public Queue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(int x){
        s1.push(x);
    }
    
    public int dequeue(){
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            System.out.print("queue is empty");
            return -1;
        }
        return s2.pop();
    }
    
    public int front(){
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            System.out.print("queue is empty");
            return -1;
        }
        return s2.peek();
    }
    
}

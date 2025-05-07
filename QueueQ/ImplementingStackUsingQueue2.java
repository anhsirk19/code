package QueueQ;

import java.util.Queue;
import java.util.ArrayDeque;

//implementaition of stack using one queue
public class ImplementingStackUsingQueue2 {
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

class Stack{
    Queue<Integer> q;
    public Stack(){
        q = new ArrayDeque<>();
    }

    //isempty
    boolean isEmpty(){
        return q.isEmpty();
    }

    //size
    int size(){
        return q.size();
    }

    //push
    void push(int x){
        if(q.isEmpty()){
            q.offer(x);
            return;
        }
        int val = q.poll();
        push(x);
        q.offer(val);
    }
    //peek
    int peek(){
        if(q.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return q.peek();
    }

    //pop
    int pop(){
        if(q.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        int val = q.poll();
        return val;
    }
}

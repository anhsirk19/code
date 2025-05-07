package QueueQ;

import java.util.ArrayDeque;
import java.util.Queue;

//implementation of stack using two queues, popheavystack
public class ImplementingStackUsingQueue {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.size());
        System.out.println(s.pop());
    }    
}

//push : o(1)
//pop : O(n)
//it is also called popHeavyStack
class Stack{
    int size;
    Queue<Integer> q1;
    Queue<Integer> q2;

    Stack(){
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
        size = 0;
    }

    //isempty
    public boolean isEmpty(){
        return size == 0;
    }

    //size
    public int size(){
        return size;
    }

    //push
    public void push(int x){
        q1.offer(x);
        size++;
    }

    //pop
    public int pop(){
        if(q1.isEmpty()){
            System.out.print("stack is empty");
            return -1;
        }
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }
        int val = q1.poll();
        size--;

        //swap q1 and q2
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return val;
    }

    //peek
    public int peek(){
        if(q1.isEmpty()){
            System.out.print("stack is empty");
            return -1;
        }
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }
        int val = q1.poll();
        q2.offer(val);
        //swap q1 and q2
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return val;
    }
}
package QueueQ;
//implmentation of queue using two stacks

import java.util.Stack;

public class ImplementingQueueusingStack {
    public static void main(String[] args) {
        
    }
}

//Costly enqueue, cheap dequeue

class Queue{
    Stack<Integer> s1;
    Stack<Integer> s2;
    public Queue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    //enqueue
    public void enqueue(int x){
        s2.push(x);
        while (s1.isEmpty() == false) {
            s2.push(s1.pop());
        }
        while(s2.isEmpty() == false){
            s1.push(s2.pop());
        }
    }

    //dequeue
    public int dequeue(){
        if(s1.isEmpty()){
            System.out.print("queue is empty");
            return -1;
        }
        return s1.pop();
    }

    //getfornt
    public int front(){
        if(s1.isEmpty()){
            System.out.print("queue is empty");
            return -1;
        }
        return s1.peek();
    }

    //isEmpty
    public boolean isEmpty(){
        return s1.isEmpty();
    }

    //size
    public int size(){
        return s1.size();
    }
}

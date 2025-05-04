package StackQ;

public class LinkedListImplementationofStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}

class Stack{
    int size;
    Node head;
    public Stack(){
        head = null;
        size = 0;
    }

    //push operation
    public void push(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }

    //pop operation
    public int pop(){
        if(head == null){
            System.out.println("stack is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //peek operation
    public int peek(){
        if(head == null){
            System.out.println("stack is empty");
            return -1;
        }
        return head.data;
    }

    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    //size
    public int size(){
        return size;
    }
}

class Node{
    int data;
    Node next;
    public Node(int x){
        this.data = x;
    }
}

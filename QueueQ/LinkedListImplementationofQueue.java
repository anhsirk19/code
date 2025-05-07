package QueueQ;

public class LinkedListImplementationofQueue {
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(4);
        System.out.println(q.size());
    }
}

class queue{
    Node front, rear;
    int size;

    public queue(){
        front = null;
        rear = null;
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

    //enqueue
    public void enqueue(int x){
        Node temp = new Node(x);
        if(rear == null){
            front = temp;
            rear = temp;
        }else{
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    //dequeue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return data;
    }

    //getfront
    public int getFront(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return front.data;
    }

    //getrear
    public int getRear(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return rear.data;
    }
}

class Node{
    int data;
    Node next;
    Node(int x){
        this.data = x;
    }
}
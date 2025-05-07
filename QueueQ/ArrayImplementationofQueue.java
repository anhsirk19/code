package QueueQ;

public class ArrayImplementationofQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.size());
    }
}

class Queue{
    int front, rear;
    int capacity, size;
    int[] arr;
    public Queue(int cap){
        capacity = cap;
        size = 0;
        front = 0;
        rear = cap - 1;
        arr = new int[capacity];
    }

    //if size is equal to given capaciy it is full
    boolean isFull(){
        return size == capacity;
    }

    //check if queue is empty;
    boolean isEmpty(){
        return size == 0;
    }

    //return the size
    int size(){
        return size;
    }

    //push at end
    void enqueue(int x){
        if(isFull()){
            System.out.println("overflow or queue is full");
            return;
        }
        rear = (rear + 1)%capacity;
        arr[rear] = x;
        size++;
    }

    //pop at first
    int dequeue(){
        if(isEmpty()){
            System.out.println("underflow or queue is empty");
            return Integer.MIN_VALUE;
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    int getFront(){
        if(isEmpty()){
            System.out.println("underflow or queue is empty");
            return Integer.MIN_VALUE;
        }
        return arr[front];
    }

    int getRear(){
        if(isEmpty()){
            System.out.println("underflow or queue is empty");
            return Integer.MIN_VALUE;
        }
        return arr[rear];
    }
}

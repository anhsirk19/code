package StackQ;

public class ArrayImplementationofStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s.size());
    }
}

class Stack{
    static final int max = 1000;
    int top;
    int[] arr; 
    public Stack(){
        top = -1;
        arr = new int[max];
    }

    public void push(int x){
        if(top == max-1){
            System.out.println("overflow of stack");
            return;
        }
        arr[++top] = x;
    }

    public int pop(){
        if(top == -1){
            System.out.println("underflow of stack or stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("underflow of stack or stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top + 1;
    }
}

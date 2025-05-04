package StackQ;

//implementation of two stacks in one array of max_size;
//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Stack/problem/implement-two-stacks-in-an-array
public class TwoStacksinanArray {
    public static void main(String[] args) {
        
    }
}

class twoStacks {
    int max = 200;
    int[] arr;
    int top1;
    int top2;
    twoStacks() {
        arr = new int[max];
        top1 = -1;// 0 to 99
        top2 = 99;// 100 to 199
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if(top1 == 99){
            return;
        }
        arr[++top1] = x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        
        if(top2 == 199){
            return;
        }
        arr[++top2] = x;
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        if(top1 == -1){
            return -1;
        }
        return arr[top1--];
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(top2 == 99){
            return -1;
        }
        return arr[top2--];
    }
}

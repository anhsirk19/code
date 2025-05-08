package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DataStructurewithMinandMaxoperations {
    public static void main(String[] args) {
        SpecialQueue arr = new SpecialQueue();
        arr.addMin(1);
        arr.addMax(2);
        arr.addMax(4);
        System.out.println(arr.getMax());
        arr.deleteMax();
        System.out.println(arr.getMax());
    }
}

class SpecialQueue {
    Deque<Integer> q;

    public SpecialQueue() {
        q = new ArrayDeque<>();
    }

    // getMin
    public int getMin() {
        if (q.isEmpty()) {
            System.out.println("it is empty");
            return -1;
        }
        return q.peekFirst();
    }

    // getMax
    public int getMax() {
        if (q.isEmpty()) {
            System.out.println("it is empty");
            return -1;
        }
        return q.peekLast();
    }

    // addMin
    public void addMin(int x) {
        q.addFirst(x);
    }

    // addMax
    public void addMax(int x) {
        q.addLast(x);
    }

    // deleteMin
    public int deleteMin() {
        if (q.isEmpty()) {
            System.out.println("it is empty");
            return -1;
        }
        int val = q.pollFirst();
        return val;
    }

    // deleteMax
    public int deleteMax() {
        if (q.isEmpty()) {
            System.out.println("it is empty");
            return -1;
        }
        int val = q.pollLast();
        return val;
    }
}

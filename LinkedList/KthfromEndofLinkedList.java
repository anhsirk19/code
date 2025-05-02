//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-LinkedList/problem/nth-node-from-end-of-linked-list

public class KthfromEndofLinkedList {
    public static void main(String[] args) {

    }

    // tc is o(n)
    // sc is o(1)
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node temp1 = head;
        Node temp2 = head;
        while (k != 0) {
            if (temp2 == null) {
                return -1;
            }
            temp2 = temp2.next;
            k--;
        }
        while (temp2 != null) {
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return temp1.data;
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}

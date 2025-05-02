//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-LinkedList/problem/delete-node-in-doubly-linked-list

public class DeleteinaDoublyLinkedList {
    public static void main(String[] args) {

    }

    //tc is o(n)
    //sc is o(1)
    public Node deleteNode(Node head, int x) {
        Node temp = head;
        // to remove the head ele
        if (x == 1) {
            head = head.next;
            head.prev = null;
            return head;
        }

        for (int i = 1; i < x - 1; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.prev = temp;
            }
        }
        return head;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }
}

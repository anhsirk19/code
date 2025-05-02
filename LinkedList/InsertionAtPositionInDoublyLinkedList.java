//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-LinkedList/problem/insert-a-node-in-doubly-linked-list

public class InsertionAtPositionInDoublyLinkedList {
    public static void main(String[] args) {

    }

    //tc is o(n)
    //sc is o(1)
    Node addNode(Node head, int p, int x) {
        Node temp = head;
        for (int i = 0; i < p; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(x);
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        return head;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }
}

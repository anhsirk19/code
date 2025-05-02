//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-LinkedList/problem/delete-without-head-pointer

public class Deletewithoutheadpointer {
    public static void main(String[] args) {

    }

    // tc is o(1)
    // sc is o(1)
    void deleteNode(Node node) {
        // Your code here
        if (node == null || node.next == null) {
            return;
        }
        node.data = node.next.data;
        node.next = node.next.next;
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

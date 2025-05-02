//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-LinkedList/problem/identical-linked-lists


public class IdenticalLinkedLists {
    public static void main(String[] args) {

    }

    // tc is o(n)
    // sc is o(1)
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else {
                return false;
            }
        }
        return true;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

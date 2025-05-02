
//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-LinkedList/problem/join-two-linked-lists

public class JoinTwoLinkedLists {
    public static void main(String[] args) {

    }

    // tc is o(n1), n = len(head1)
    // sc is o(1)
    public static Node joinTheLists(Node head1, Node head2) {
        // your code here
        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head2;
        return head1;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

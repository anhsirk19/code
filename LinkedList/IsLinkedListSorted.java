//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-LinkedList/problem/is-linked-list-sorted

public class IsLinkedListSorted {
    public static void main(String[] args) {

    }

    //tc is o(n)
    //sc is o(1)
    public static boolean isSorted(Node head) {
        // check for sorted
        Node temp = head;
        boolean isInc = true;
        boolean isDec = true;
        while (temp != null && temp.next != null) {
            int a = temp.data;
            int b = temp.next.data;

            // check increse
            if (a > b) {
                isInc = false;
            }
            if (a < b) {
                isDec = false;
            }
            temp = temp.next;
        }
        return isDec || isInc;
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

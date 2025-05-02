//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-LinkedList/problem/find-length-of-loop

public class FindLengthOfLoopInLinkedList {
    public static void main(String[] args) {
        
    }
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
     // Function to find the length of a loop in the linked list.
     //tc is o(n + k) = o(n)
     //sc is o(1)
     public int countNodesinLoop(Node head) {
        Node slow = head;
        Node fast = head;
        int count = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            //loop present
            if(slow == fast){
                do{
                    count++;
                    slow = slow.next;
                }while(slow != fast);
                return count;
            }
        }
        //loop not present, count = 0
        return 0;
    }
}

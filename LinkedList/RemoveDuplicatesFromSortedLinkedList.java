//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-LinkedList/problem/remove-duplicate-element-from-sorted-linked-list

public class RemoveDuplicatesFromSortedLinkedList {
    public static void main(String[] args) {
        
    }
    // Function to remove duplicates from sorted linked list.
    //tc is o(n)
    //sc is o(1)
    Node removeDuplicates(Node head) {
        // Your code here
        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.data == temp.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
    
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

}

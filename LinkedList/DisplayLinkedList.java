import java.util.ArrayList;

//to display the l;inked list 

public class DisplayLinkedList {
    public static void main(String[] args) {

    }
    //tc is o(n)
    //sc is o(1)
    public static ArrayList<Integer> displayList(Node head) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
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

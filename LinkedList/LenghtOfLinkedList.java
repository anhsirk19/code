public class LenghtOfLinkedList{
    public static void main(String[] args) {
        
    }
    //tc is o(n)
    //sc is o(1)
    public int getCount(Node head) {
        // code here
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    private class Node{
        @SuppressWarnings("unused")
        private int data;
        private Node next;
       
        @SuppressWarnings("unused")
        public Node(int value){
            this.data = value;
        }
    }
}
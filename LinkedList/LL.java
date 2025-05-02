public class LL {
    private Node head;
    private Node tail;
    public int size;

    public LL(){
        this.size = 0;
    }

    // 1. insert operationjs

    // 1.1 insert at start
    public void insertAtStart(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    // 1.2 insert at end
    public void insertAtEnd(int value){
        if(size == 0){
            insertAtEnd(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;

        size += 1;
    }

    // 1.3 insert at index
    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertAtStart(value);
            return;
        }
        if(index == size){
            insertAtEnd(value);
            return;
        }
        Node temp = head;
        for(int i = 1 ; i < index ; i++){
            temp = temp.next; //moving temp to (index - 1) position
        }
        Node newNode = new Node(value, temp.next); // newNode.next = temp.next;
        temp.next = newNode;

        size += 1;
    }

    // 2. delete operarions

    // 2.1 deleteFirst

    public int deleteFirst(){
        int val = head.data;
        if(head == null){
            return -1;
        }
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    // 2.2 deleteEnd

    public int deleteEnd(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-1);
        int val = tail.data;
        secondLast.next = null;
        tail = secondLast;
        size--;
        return val;
    }

    // 2.3 delete ele at given index

    public int deleteIndex(int index){

        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteEnd();
        }
        if(index < 0 || index >= size){
            return -1;
        }
        Node prevIndex = get(index-1);
        int val = prevIndex.next.data;
        prevIndex.next = prevIndex.next.next;

        size--;

        return val;
    }

    // 2 to display list
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    //to get ref node at index

    public Node get(int index){
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp;
    }

    //define Node Structure
    private class Node{
        private int data;
        private Node next;
       
        public Node(int value){
            this.data = value;
        }
        public Node(int value, Node next){
            this.data = value;
            this.next = next;
        }
    }
}

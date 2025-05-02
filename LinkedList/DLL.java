//implementation of doubly linked list;

public class DLL {
    private Node head;
    private Node tail;

    public int size;

    public DLL(){
        size = 0;
    }

    // 1 insert operations

    // 1.1 insert node at begining
    public void insertAtStart(int val){
        Node newNode = new Node(val, head, null);
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    // 1.1 insert node at end
    public void insertAtEnd(int val){
        if(tail == null){
            insertAtStart(val);
            return;
        }
        Node newNode = new Node(val, null, tail);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertAtIndex(int val, int index){
        if(index == 0){
            insertAtStart(val);
            return;
        }
        if(index == size){
            insertAtEnd(val);
            return;
        }
        Node prevIndexNode = getNode(index-1);
        Node newNode = new Node(val, prevIndexNode.next, prevIndexNode);
        prevIndexNode.next.prev = newNode;
        prevIndexNode.next = newNode;
        size++;
    }

    // 2 delete operations

    // 2.1 delete at first
    public int deleteFirst(){
        if(size == 0){
            return -1;
        }
        int val = head.data;
        head = head.next;
        if(head != null){
            head.prev = null;
        }else{
            tail = null; //if list becomes empty
        }
        size--;
        return val;
    }

    //2.2 delete at last

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    //2.3 delete at index
    public int deleteIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        if(index < 0 || index >= size){
            return -1;
        }
        Node prevIndexNode = getNode(index-1);
        int val = prevIndexNode.next.data;
        prevIndexNode.next = prevIndexNode.next.next;
        prevIndexNode.next.prev = prevIndexNode;
        size--;
        return val;
    }

    //to get a ref node at index
    public Node getNode(int index){
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp;
    }
    //to display the dll

    public void display(){
        Node temp = head;
        System.out.print("START -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    //to display the dll in reverse order

    public void displayReverse(){
        Node temp = tail;
        System.out.print("START <- ");
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.prev;
        }
        System.out.print("END");
    }
    private class Node{
        private int data;
        Node next;
        Node prev;
        Node(int value){
            this.data = value;
        }
        Node(int value, Node next, Node prev){
            this.data = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

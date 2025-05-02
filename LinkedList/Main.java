public class Main {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertAtStart(3);
        // list.insertAtStart(2);
        // list.insertAtStart(1);
        // list.insertAtEnd(99);
        // list.insertAtIndex(100, 3);
        // System.out.println(list.deleteFirst());
        // System.out.println(list.deleteEnd());
        // list.insertAtEnd(200);
        // list.insertAtEnd(300);
        // list.insertAtEnd(400);
        // System.out.println(list.deleteIndex(5));
        
        // list.display();
        // System.out.println(list.size);

        // DLL list = new DLL();
        // list.insertAtStart(2);
        // list.insertAtStart(1);
        // list.insertAtEnd(4);
        // list.insertAtEnd(5);
        // list.insertAtEnd(6);
        // list.insertAtIndex(3, 2);
        // System.out.println(list.deleteFirst());
        // System.out.println(list.deleteLast());
        // System.out.println(list.deleteIndex(2));
        // list.display();
        // System.out.println();
        // list.displayReverse();

        CLL list = new CLL();
        list.insert(1);
        list.insert(19);
        list.insert(100);
        list.insert(3);
        list.delete(3);
        list.display();


    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtStart(3);
        list.insertAtStart(2);
        list.insertAtStart(1);
        list.insertAtEnd(99);
        list.insertAtIndex(100, 3);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteEnd());
        list.insertAtEnd(200);
        list.insertAtEnd(300);
        list.insertAtEnd(400);
        System.out.println(list.deleteIndex(5));
        
        list.display();
        System.out.println(list.size);
    }
}

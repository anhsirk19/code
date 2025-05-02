public class CLL {
    private Node head;
    private Node tail;
    public int size;

    public CLL() {
        this.size = 0;
    }

    // Insert at end
    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;  // make circular
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    // Delete a node with given value
    public void delete(int val) {
        if (head == null) {
            return;  // list is empty
        }

        Node node = head;

        // Case 1: deleting head
        if (head.data == val) {
            if (head == tail) {
                // only one node
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            size--;
            return;
        }

        // Case 2: search and delete
        do {
            if (node.next.data == val) {
                if (node.next == tail) {
                    tail = node;  // update tail if deleting last
                }
                node.next = node.next.next;
                size--;
                return;
            }
            node = node.next;
        } while (node != head);
        // If we reach here, value not found → do nothing
    }

    // Display list
    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("HEAD");
    }

    private class Node {
        private int data;
        Node next;

        public Node(int val) {
            this.data = val;
        }
    }
}

package linked_list;

public class doublyList {
    public static class Node {
        int data;
        Node next,prev;
        public Node(int val) {
            data = val;
            next = prev = null;
        }
    }
    public static class List {
        Node head = null;
        public void display() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+"<->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public int size() {
            int n = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                n++;
            }
            return n;
        }
        public void insertAtHead(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        public void insertAtTail(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        public void insertAtPos(int val, int pos) {
            int n = size();
            if (pos <= 0 || pos > n) {
                System.out.println("Operation not possible.");
                return;
            }
            if (pos == 1) {
                insertAtHead(val);
                return;
            }
            if (pos == n) {
                insertAtTail(val);
                return;
            }
            int i = 1;
            Node newNode = new Node(val);
            Node temp = head;
            while (i != pos-1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }
        public void removeAtHead() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            head = head.next;
            head.prev = null;
        }
        public void removeAtTail() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next.prev = null;
            temp.next = null;
        }
        public void removeAtPos(int pos) {
            int n = size();
            if (pos <= 0 || pos > n) {
                System.out.println("Operation not possible.");
                return;
            }
            if (pos == 1) {
                removeAtHead();
                return;
            }
            if (pos == n) {
                removeAtTail();
                return;
            }
            Node temp = head;
            int i = 1;
            while (i != pos-1) {
                temp = temp.next;
                i++;
            }
            temp.next.next.prev = temp;
            temp.next = temp.next.next;
            temp.next.next = null;
            temp.next.prev = null;
        }
    }
    public static void main(String[] args) {
        List li = new List();
        li.insertAtHead(3);
        li.insertAtHead(2);
        li.insertAtHead(1);
        li.insertAtTail(4);
        li.insertAtTail(5);
        li.insertAtTail(6);
        li.insertAtPos(7,4);
        li.insertAtPos(8,3);
        li.insertAtPos(9,2);
        li.removeAtHead();
        li.removeAtTail();
        li.removeAtPos(5);
        li.display();
    }
}

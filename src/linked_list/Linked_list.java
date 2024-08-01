package linked_list;

public class Linked_list {
    public static class Node {
        int data;
        Node next;

        public Node(int val) {
            data = val;
            next = null;
        }
    }
    public static class LinkedList {
        Node head = null;
        public void display() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+"->");
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
        public void insertAtHead(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void insertAtTail(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        public void insertAtPos(int data, int pos) {
            int n = size();
            if(pos <= 0 || pos > n) {
                return;
            }
            if (pos == 1) {
                insertAtHead(data);
                return;
            }
            if (pos == n) {
                insertAtTail(data);
                return;
            }
            int i = 1;
            Node newNode = new Node(data);
            Node temp = head;
            while (i != pos-1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public void removeAtHead() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            head = head.next;
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
            temp.next = null;
        }
        public void removeAtPos(int pos) {
            int n = size();
            if (pos <= 0 || pos > n) {
                return;
            }
            if (head == null) {
                System.out.println("List is empty!");
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
            Node temp1 = head.next;
            int i = 1;
            while (i != pos) {
                temp = temp.next;
                temp1 = temp1.next;
                i++;
            }
            temp.next = temp1.next;
            temp1.next = null;
        }
        public void update(int val, int pos) {
            int n = size();
            if (pos <= 0 || pos > n) {
                return;
            }
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            if (pos == 1) {
                head.data = val;
                return;
            }
            int i = 1;
            Node temp = head;
            while (i != pos+1) {
                temp = temp.next;
                i++;
            }
            temp.data = val;
        }
        public int search(int ele) {
            int pos = 0;
            Node temp = head;
            while (temp != null) {
                if (temp.data == ele) {
                    pos++;
                    break;
                }
                else {
                    temp = temp.next;
                }
            }
            return pos;
        }
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtHead(3);
        li.insertAtHead(2);
        li.insertAtHead(1);
        li.insertAtTail(4);
        li.insertAtTail(5);
        li.insertAtTail(6);
        li.insertAtPos(7,3);
        li.insertAtPos(8,2);
        li.insertAtPos(9,4);
        li.removeAtHead();
        li.removeAtTail();
        li.removeAtPos(2);
        li.update(1,1);
        li.update(6,3);
        li.display();
        System.out.println(li.search(1));
        System.out.println("Size of linked list: "+li.size());
    }
}
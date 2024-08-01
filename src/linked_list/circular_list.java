package linked_list;

public class circular_list {
    public static class Node {
        int data;
        Node next;
        public Node(int val) {
            data = val;
            next = null;
        }
    }
    public static class List {
        Node head = null;
        public void display() {
            Node temp = head;
            do {
                System.out.print(temp.data+"->");
                temp = temp.next;
            } while (temp != head);
        }
        public int size() {
            Node temp = head;
            int n = 0;
            do {
                temp = temp.next;
                n++;
            } while (temp != head);
            return n;
        }
        public void insertAtHead(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                newNode.next = head;
                return;
            }
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            head = newNode;
            temp.next = head;
        }
        public void insertAtTail(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                newNode.next = head;
                return;
            }
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        public void insertAtPos(int data, int pos) {
            int n = size();
            pos = pos%n;
            if (pos == 1) {
                insertAtHead(data);
                return;
            }
            if (pos == size()) {
                insertAtTail(data);
                return;
            }
            int i = 1;
            Node temp = head;
            Node newNode = new Node(data);
            while (i != pos-1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public void removeAtHead() {
            Node temp = head;
            Node temp1 = temp.next;
            while (temp.next != head) {
                temp = temp.next;
                temp1 = temp1.next;
            }
            temp.next = temp1.next;
            head = temp1.next;
            temp1.next = null;
        }
        public void removeAtTail() {
            Node temp = head;
            Node temp1 = temp.next;
            while (temp.next.next != head) {
                temp = temp.next;
                temp1 = temp1.next;
            }
            temp.next = temp1.next;
            head = temp1.next;
            temp1.next = null;
        }
        public void removeAtPos(int pos) {
            int n = size();
            pos = pos%n;
            if (pos == 1) {
                removeAtHead();
                return;
            }
            if (pos == n) {
                removeAtTail();
                return;
            }
            int i = 1;
            Node temp = head;
            Node temp1 = temp.next;
            while (i != pos -1) {
                temp = temp.next;
                temp1 = temp1.next;
                i++;
            }
            temp.next = temp1.next;
            temp1.next = null;
        }
    }
    public static class DC_Node {
        int data;
        DC_Node next,prev;
        public DC_Node(int val) {
            data = val;
            next = prev = null;
        }
    }
    public static class DC_List {
        DC_Node head = null;
        public void display() {
            DC_Node temp = head;
            do {
                System.out.print(temp.data+"<->");
                temp = temp.next;
            } while (temp != head);
        }
        public int size() {
            DC_Node temp = head;
            int n = 0;
            do {
                temp = temp.next;
                n++;
            } while (temp != head);
            return n;
        }
        public void insertAtHead(int data) {
            DC_Node temp = head;
            DC_Node newNode = new DC_Node(data);
            if (head == null) {
                head = newNode;
                head.next = head;
                head.prev = head;
                return;
            }
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            newNode.prev = temp;
            head.prev = newNode;
            head = newNode;
        }
        public void insertAtTail(int data) {
            DC_Node newNode = new DC_Node(data);
            DC_Node temp = head;
            if (head == null) {
                head = newNode;
                head.next = head;
                head.prev = head;
                return;
            }
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = head;
            head.prev = newNode;
        }
        public void insertAtPos(int data, int pos) {
            DC_Node temp = head;
            DC_Node newNode = new DC_Node(data);
            int n = size();
            pos = pos%n;
            if (pos == 1) {
                insertAtHead(data);
                return;
            }
            if (pos == n) {
                insertAtTail(data);
                return;
            }
            int i = 1;
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
            DC_Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head.next.prev = temp;
            head.next = null;
            head.prev = null;
            head = temp.next;
        }
        public void removeAtTail() {
            DC_Node temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next.next = null;
            temp.next.prev = null;
            temp.next = head;
            head.prev = temp;
        }
        public void removeAtPos(int pos) {
            DC_Node temp = head;
            DC_Node temp1 = temp.next;
            int i = 1;
            int n = size();
            pos = pos%n;
            while (i != pos-1) {
                temp = temp.next;
                temp1 = temp1.next;
                i++;
            }
            temp.next = temp1.next;
            temp1.next.prev = temp;
            temp1.prev = null;
            temp1.next = null;
        }
    }

    public static void main(String[] args) {
        List li = new List();
        DC_List DC_li = new DC_List();
        li.insertAtHead(3);
        li.insertAtHead(2);
        li.insertAtHead(1);
        li.insertAtTail(4);
        li.insertAtTail(5);
        li.insertAtTail(6);
        li.insertAtPos(7,4);
        li.insertAtPos(8,5);
        li.insertAtPos(9,6);
        li.removeAtHead();
        li.removeAtTail();
        li.removeAtPos(5);
        li.display();
        System.out.println();
        DC_li.insertAtHead(3);
        DC_li.insertAtHead(2);
        DC_li.insertAtHead(1);
        DC_li.insertAtTail(4);
        DC_li.insertAtTail(5);
        DC_li.insertAtTail(6);
        DC_li.insertAtPos(7,4);
        DC_li.insertAtPos(8,5);
        DC_li.insertAtPos(9,6);
        DC_li.removeAtHead();
        DC_li.removeAtTail();
        DC_li.removeAtPos(5);
        DC_li.display();
    }
}

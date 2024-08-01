package queue;

public class Queue {
    public static class queueUsingArray {
        int front, rear,size = 5;
        int[] q = new int[size];
        queueUsingArray() {
            front = rear = -1;
        }
        public boolean isFull() {
            return rear == size;
        }
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public int peek() {
            return q[front];
        }
        public void enqueue(int ele) {
            if (isFull()) {
                System.out.println("Queue Overflow!");
                return;
            }
            if (front == -1 && rear == -1) {
                front = rear = 0;
                q[rear] = ele;
                return;
            }
            rear++;
            q[rear] = ele;
        }
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow!");
                return;
            }
            if (front == rear) {
                front = rear = -1;
                return;
            }
            front++;
        }
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue Underflow!");
                return;
            }
            for (int i = front; i <= rear; i++) {
                System.out.print(q[i]+" ");
            }
            System.out.println();
        }
    }
    public static class circularQueueUsingArray {
        int front,rear,size = 5;
        int[] q = new int[size];
        circularQueueUsingArray() {
            front = rear = -1;
        }
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public void enqueue(int ele) {
            if (isEmpty()) {
                front = rear = 0;
                q[rear] = ele;
                return;
            }
            if (rear == size - 1) {
                rear = 0;
                q[rear] = ele;
                return;
            }
            rear++;
            q[rear] = ele;
        }
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow!");
                return;
            }
            if (front == size - 1) {
                front = 0;
                return;
            }
            front++;
        }
        public int peek() {
            return q[front];
        }
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue Underflow!");
                return;
            }
            if (rear < front) {
                for (int i = front; i <= size-1; i++) {
                    System.out.print(q[i]+" ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(q[i]+" ");
                }
                System.out.println();
            }
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(q[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }
    public static class queueUsingLinkedList {
        Node front = null;
        Node rear = null;
        public boolean isEmpty() {
            return (front == null && rear == null);
        }
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow!");
                return;
            }
            if (front.next == null) {
                front = rear = null;
                return;
            }
            Node temp = front;
            front = front.next;
            temp.next = null;
        }
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue Underflow!");
                return;
            }
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public int peek() {
            return front.data;
        }
    }
    public static class circularQueueUsingLinkedList {
        Node front = null;
        Node rear = null;
        public boolean isEmpty() {
            return (front == null && rear == null);
        }
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = rear = newNode;
                front.next = front;
                return;
            }
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow!");
                return;
            }
            if (front.next == null) {
                front = rear = null;
                return;
            }
            Node temp = front;
            front = front.next;
            rear.next = front;
            temp.next = null;
        }
        public void display() {
            Node temp = front;
            do {
                System.out.print(temp.data+" ");
                temp = temp.next;
            } while (temp != front);
            System.out.println();
        }
        public int peek() {
            return front.data;
        }
    }

    public static void main(String[] args) {
        queueUsingArray q1 = new queueUsingArray();
        circularQueueUsingArray q2 = new circularQueueUsingArray();
        queueUsingLinkedList q3 = new queueUsingLinkedList();
        circularQueueUsingLinkedList q4 = new circularQueueUsingLinkedList();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.dequeue();
        q1.dequeue();
        q1.display();
        System.out.println(q1.peek());
        q2.enqueue(1);
        q2.enqueue(2);
        q2.enqueue(3);
        q2.enqueue(4);
        q2.enqueue(5);
        q2.dequeue();
        q2.dequeue();
        q2.enqueue(6);
        q2.enqueue(7);
        q2.display();
        System.out.println(q2.peek());
        q3.enqueue(1);
        q3.enqueue(2);
        q3.enqueue(3);
        q3.enqueue(4);
        q3.enqueue(5);
        q3.dequeue();
        q3.dequeue();
        q3.display();
        System.out.println(q3.peek());
        q4.enqueue(1);
        q4.enqueue(2);
        q4.enqueue(3);
        q4.enqueue(4);
        q4.enqueue(5);
        q4.dequeue();
        q4.dequeue();
        q4.enqueue(6);
        q4.enqueue(7);
        q4.display();
        System.out.println(q4.peek());
    }
}
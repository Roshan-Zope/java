package Stack;

public class stack {
    public static class stackUsingArray {
            int size = 50;
            int top = -1;
            int[] stk = new int[size];
            public boolean isEmpty() {
                return top == -1;
            }
            public boolean isFull() {
                return top == size;
            }
            public void display() {
                if (isEmpty()) {
                    System.out.println("Stack is Empty");
                    return;
                }
                int itr = top;
                while (itr != -1) {
                    System.out.println("|"+stk[itr]+"|");
                    itr--;
                }
            }
            public void push(int ele) {
                if (isFull()) {
                    System.out.println("Stack Overflow!");
                    return;
                }
                top++;
                stk[top] = ele;
            }
            public void pop() {
                if (isEmpty()) {
                    System.out.println("Stack Underflow!");
                    return;
                }
                top--;
            }
            public int Top() {
                return stk[top];
            }
    }
    public static class stackUsingLinkedList {
        public static class Node {
            int data;
            Node next;
            Node (int val) {
                data = val;
                next = null;
            }
        }
        Node top = null;
        public boolean isEmpty() {
            return top == null;
        }
        public int Top() { return top.data; }
        public void push(int ele) {
            Node newNode = new Node(ele);
            if (isEmpty()) {
                top = newNode;
                return;
            }
            newNode.next = top;
            top = newNode;
        }
        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return;
            }
            Node temp = top;
            top = temp.next;
            temp.next = null;
        }
        public void display() {
            Node temp = top;
            while (temp != null) {
                System.out.println("|"+temp.data+"|");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        stackUsingArray stk = new stackUsingArray();
        stk.push(5);
        stk.push(4);
        stk.push(3);
        stk.push(2);
        stk.push(1);
        stk.pop();
        stk.pop();
        stk.display();
        System.out.println(stk.Top());
        stackUsingLinkedList stk1 = new stackUsingLinkedList();
        stk1.push(5);
        stk1.push(4);
        stk1.push(3);
        stk1.push(2);
        stk1.push(1);
        stk1.pop();
        stk1.pop();
        stk1.display();
        System.out.println(stk1.Top());
    }
}

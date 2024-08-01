package OOP;
class Parent {
    public void fun() {
        System.out.println("Parent class method is called");
    }
}
class Child1 extends Parent{
    @Override public void fun() {
        System.out.println("Child1 class method is called");
    }
}
class Child2 extends Parent {
    @Override public void fun() {
        System.out.println("Child2 class method is called");
    }
}
class Add {
    public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int a, int b, int c) {
        return a+b+c;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        // method overriding/ run time polymorphism/ dynamic polymorphism example
        Parent p1 = new Parent();
        Parent p2 = new Child1();
        Parent p3 = new Child2();
        p1.fun();
        p2.fun();
        p3.fun();
        // example of method overloading/ compile time polymorphism/ static polymorphism
        System.out.println(Add.add(2,3));
        System.out.println(Add.add(2,3,4));
    }
}

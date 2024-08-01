package OOP;
interface Parent1 {
    default void fun() {
        System.out.println("Hello");
    }
    int var = 10;
}
interface Parent2 {
    default void fun() {
        System.out.println("world");
    }
}

public class MultipleInheritance implements Parent1, Parent2{
    @Override public void fun() {
        Parent1.super.fun();
        Parent2.super.fun();
    }
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.fun();
    }
}

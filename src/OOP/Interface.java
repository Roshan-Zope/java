/*An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.
An interface in Java is a blueprint of a behavior. A Java interface contains static constants and abstract methods
Interface is a collection of abstract methods and constants*/
package OOP;
interface Interface1 {
    final int a = 10;
    public void display();
}
public class Interface implements Interface1{
    @Override public void display() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Interface inf = new Interface();
        inf.display();
        System.out.println(inf.a);
    }
}

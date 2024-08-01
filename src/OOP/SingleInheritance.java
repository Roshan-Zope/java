package OOP;
class Demo {
    int a;
    public Demo (int a) {
        this.a = a;
    }
    public void display() {
        System.out.println("Demo class method called");
        System.out.println(a);
    }
}
public class SingleInheritance extends Demo{
    public SingleInheritance(int a) {
        super(a);
    }
    public static void main(String[] args) {
        SingleInheritance obj = new SingleInheritance(5);
        obj.display();
    }
}

package OOP;
// abstract class
//abstract class Car {
//    public abstract void fun();
//}
//
//class Tata extends Car {
//    // hiding implementation details
//    @Override public void fun() {
//        System.out.println("Tata Motors here!");
//    }
//}
abstract class Shape {
    public abstract double area(); // these are the abstract methods
    public abstract double perimeter();
    public abstract void print();
    String color;
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() { // concrete method
        return color;
    }
}

class Rectangle extends Shape {
    double length, breadth;
    public Rectangle(double length, double breadth, String color) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }
    @Override public double area() {
        return length*breadth;
    }
    @Override public double perimeter() {
        return 2*(length+breadth);
    }
    @Override public void print() {
        System.out.println("area of rectangle having color "+super.getColor()+" is "+ area());
        System.out.println("perimeter of rectangle having color "+super.getColor()+" is "+perimeter());
    }
}

class Circle extends Shape{
    double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override public double area() {
        return 3.1415*radius*radius;
    }
    @Override public double perimeter() {
        return 2*3.1415*radius;
    }
    @Override public void print() {
        System.out.println("area of circle having "+super.getColor()+" is "+area());
        System.out.println("circumference of circle having "+super.getColor()+" is "+perimeter());
    }
}

public class Abstraction {

    public static void main(String[] args) {
//        Car c1 = new Tata(); // object of Car class but accessing content of Tata class
//        c1.fun();
        Shape s1 = new Rectangle(20.0,10.0,"red");
        Shape s2 = new Circle("black",7.0);
        s1.print();
        s2.print();
    }
}

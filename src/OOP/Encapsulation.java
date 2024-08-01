package OOP;
class Person {
    String name;
    int age;
    public void setName(String name) { // setter method
        this.name = name;
    }
    public String getName() { // getter method
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(17);
        p1.setName("roshan");
        System.out.println("age: "+p1.getAge());
        System.out.println("name: "+p1.getName());
    }
}

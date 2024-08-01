package Basics;
import java.util.Scanner;
public class areaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        System.out.println("Enter radius : ");
        radius = sc.nextDouble();
        double area = 3.1415*radius*radius;
        System.out.println("area of circle having radius "+radius+" units is "+area+" sq. units");
    }
}

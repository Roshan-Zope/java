package conditionals;
import java.util.Scanner;
public class isItTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Valid triangle");
        }
        else {
            System.out.println("Invalid triangle");
        }
    }
}

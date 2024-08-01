/* take two integer input a and b : a > b, and find the remainder when a is divided by b. */
package Basics;
import java.util.Scanner;
public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Enter a number : ");
        int b = sc.nextInt();
        int rem = a%b;
        System.out.println("remainder : "+rem);
    }
}

//take positive integer input and tell if it is divisible by 5 or not.
package conditionals;
import java.util.Scanner;
public class diviBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n % 5 == 0) {
            System.out.println(n+" is divisible by 5");
        }
        else {
            System.out.println(n+" is not divisible by 5");
        }
    }
}

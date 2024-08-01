//find the sum of digit of a number
package loops;
import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while(n > 0) {
            int rem = n%10;
            sum += rem;
            n /= 10;
        }
        System.out.println("Sum of digit of a "+num+" number is "+sum);
    }
}

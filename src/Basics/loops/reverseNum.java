//reverse a number
package loops;
import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int num = n;
        int reverse = 0;
        while(n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        System.out.println("Reverse of "+num+" is "+reverse);
    }
}

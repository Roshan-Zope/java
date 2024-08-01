// Decimal to Binary
package NumberSystem;
import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        int num = sc.nextInt();
        int ans = 0; //binary number
        int power = 1; // power of 10

        while(num > 0) {
            int parity = num % 2;
            ans += (parity * power);
            power *= 10;
            num /= 2;
        }
        System.out.println("Binary : "+ans);
    }
}

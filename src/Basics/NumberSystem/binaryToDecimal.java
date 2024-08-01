//binary to decimal
package NumberSystem;
import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter binary number : ");
        int num = sc.nextInt();
        int ans = 0; // converted decimal number
        int power = 1; // 2 ^ 0 = 1 power of 2

        while(num > 0) {
            int unit_digit = num % 2;
            ans += unit_digit * power;
            num /= 10;
            power *= 2;
        }
        System.out.println("Decimal number : "+ans);
    }
}

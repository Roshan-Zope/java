//find a raise to power b
package loops;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number : ");
        int a = sc.nextInt();
        System.out.println("Enter exponent number : ");
        int b = sc.nextInt();
        int ans = 1;
        for(int i = 1;i <= b;i++) {
            ans = ans * a;
        }
        System.out.println(a+" raise to power "+b+" is "+ans);
    }
}

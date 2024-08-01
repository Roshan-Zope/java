//print the sum of n natural number
package loops;
import java.util.Scanner;
public class sumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0;i <= n;i++) {
            sum = sum + i;
        }
        System.out.println("sum of first "+n+" natural number is "+sum);
    }
}

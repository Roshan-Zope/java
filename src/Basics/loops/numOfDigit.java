//count the number of digit for a given number n
package loops;
import java.util.Scanner;
public class numOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        while(n > 0) {
            n /= 10;
            count++;
        }
        System.out.println(num+" has "+count+" digit");
    }
}

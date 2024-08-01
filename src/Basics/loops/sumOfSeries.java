//find the sum of series 1-2+3-4.....
package loops;
import java.util.Scanner;
public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i <= n;i++) {
            if(i % 2 == 0) {
                sum = sum - i;
            }
            else {
                sum = sum + i;
            }
        }
        System.out.println("Sum : "+sum);
    }
}

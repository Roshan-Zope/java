package loops;
import java.util.Scanner;
public class streamOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter -1 to terminate program");
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;

        while(n != -1) {
            sum += n;
            System.out.println("Enter a number : ");
            n = sc.nextInt();
        }
        System.out.println("Sum : "+sum);
    }
}

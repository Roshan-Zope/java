//tell if a number is divisible by 3 and 5
package conditionals;
import java.util.Scanner;
public class diviBy3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0) {
            System.out.println(n+" is divisible by both 3 and 5");
        }
        else {
            System.out.println(n+" is not divisible by both 3 and 5");
        }
    }
}

//check number is divisible by 3 and 5 but not by 15
package conditionals;
import java.util.Scanner;
public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0) {
            if(n % 15 != 0) {
                System.out.println(n+" is divisible by 3 and 5 but not by 15");
            }
            else {
                System.out.println(n+" is divisible by 3,5 and 15");
            }
        }
        else {
            System.out.println(n+" is divisible by 3,5 and 15");
        }
    }
}

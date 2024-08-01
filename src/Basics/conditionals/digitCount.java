//tell if a number is 3 digit number or not
package conditionals;
import java.util.Scanner;
public class digitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n > 99 && n < 1000) {
            System.out.println(n+" have 3 digit");
        }
        else {
            System.out.println(n+" is not have 3 digit");
        }
    }
}

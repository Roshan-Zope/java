//print the absolute value of that integer
package conditionals;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n = sc.nextInt();
        int abs = n * -1;
        System.out.println("absolute value of "+n+" is "+abs);
    }
}

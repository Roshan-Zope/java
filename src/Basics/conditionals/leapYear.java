//determine whether the year is a leap or not.
package conditionals;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int year = sc.nextInt();
        if(year % 4 == 0) {
            System.out.println(year+" is leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}

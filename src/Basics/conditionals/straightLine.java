//check if all the three points fall on one straight line
package conditionals;
import java.util.Scanner;
public class straightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three co-ordinates");
        System.out.println("x1 : ");
        int x1 = sc.nextInt();
        System.out.println("y1 : ");
        int y1 = sc.nextInt();
        System.out.println("x2 : ");
        int x2 = sc.nextInt();
        System.out.println("y2 : ");
        int y2 = sc.nextInt();
        System.out.println("x3 : ");
        int x3 = sc.nextInt();
        System.out.println("y3 : ");
        int y3 = sc.nextInt();
        int m1 = (y2 - y1)/(x2 - x1);
        int m2 = (y3 - y2)/(x3 - x2);
        if(m1 == m2) {
            System.out.println("Given co-ordinates lies on one straight line");
        }
        else {
            System.out.println("Given co-ordinates does not lies on one straight line");
        }
    }
}

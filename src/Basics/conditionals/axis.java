//find out point lies on x-axis, y-axis or origin
package conditionals;
import java.util.Scanner;
public class axis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates");
        System.out.println("x : ");
        int x = sc.nextInt();
        System.out.println("y : ");
        int y = sc.nextInt();
        if((x < 0) && (y == 0)) {
            System.out.println("lies on negative x-axis");
        }
        else if((x > 0) && (y == 0)) {
            System.out.println("lies on positive x-axis");
        }
        else if((y > 0) && (x == 0)) {
            System.out.println("lies on positive y-axis");
        }
        else if((y < 0) && (x == 0)) {
            System.out.println("lies on negative y-axis");
        }
        else {
            System.out.println("lies on origin");
        }
    }
}

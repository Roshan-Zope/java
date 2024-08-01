//determine whether a point lies on circle,inside the circle or outside the circle
package conditionals;
import java.util.Scanner;
public class pointOnCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of center of circle");
        System.out.println("x : ");
        int x = sc.nextInt();
        System.out.println("y : ");
        int y = sc.nextInt();
        System.out.println("Enter the co-ordinates of point");
        System.out.println("x1 : ");
        int x1 = sc.nextInt();
        System.out.println("y1 : ");
        int y1 = sc.nextInt();
        System.out.println("Enter radius of circle : ");
        int r = sc.nextInt();
        int dist = ((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
        if(dist > r*r) {
            System.out.println("point is outside the circle");
        }
        else if(dist < r*r) {
            System.out.println("point is inside the circle");
        }
        else {
            System.out.println("point is on the circle");
        }
    }
}

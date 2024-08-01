//find whether area of rectangle is greater than its perimeter
package conditionals;
import java.util.Scanner;
public class areaPerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        int l = sc.nextInt();
        System.out.println("Enter breadth of rectangle : ");
        int b = sc.nextInt();
        int area = l * b;
        int perimeter = 2 * (l + b);
        if(area > perimeter) {
            System.out.println("area is greater than its perimeter ");
        }
        else {
            System.out.println("perimeter is greater than its area ");
        }
    }
}

//check rectangle is square or not
package conditionals;
import java.util.Scanner;
public class rectangleORsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int l = sc.nextInt();
        System.out.println("Enter breadth : ");
        int b = sc.nextInt();
        if(l == b) {
            System.out.println("given dimensions are of square");
        }
        else {
            System.out.println("Given dimensions are of rectangle");
        }
    }
}

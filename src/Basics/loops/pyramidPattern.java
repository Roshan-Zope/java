//    *
//   ***
//  *****
// *******
package loops;
import java.util.Scanner;
public class pyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        int spc = rows - 1;

        for(int i = 1;i <= rows;i++) {
            for(int j = spc;j >= 1;j--) {
                System.out.print(" ");
            }
            spc--;
            for(int k = 1;k <= 2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

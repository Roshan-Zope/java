//       1
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1
package loops;
import java.util.Scanner;
public class numPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        int spc = rows - 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            spc--;
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i-1; l >= 1; l--) {
                System.out.println(l);
            }
            System.out.println();
        }
    }
}

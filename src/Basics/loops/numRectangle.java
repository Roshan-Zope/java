// 1 2 3 4 5 6 7
// 2 3 4 5 6 7 1
// 3 4 5 6 7 1 2
// 4 5 6 7 1 2 3
// 5 6 7 1 2 3 4
// 6 7 1 2 3 4 5
// 7 1 2 3 4 5 6
package loops;
import java.util.Scanner;
public class numRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();

        for(int i = 1; i < rows; i++) {
            for(int j = i; j <= rows; j++) {
                System.out.print(j);
            }
            for(int k = 1; k <= i-1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

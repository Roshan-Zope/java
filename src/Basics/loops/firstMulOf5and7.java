//print the first multiple of 5 which is also a multiple of 7
package loops;
import java.util.Scanner;
public class firstMulOf5and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(true) {
            if((i % 5 == 0) && (i % 7 == 0)) {
                System.out.println("Multiple found : "+i);
                break;
            }
            i++;
        }
    }
}

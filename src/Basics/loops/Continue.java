//print all the values between 1 and 50 except for the multiple of 3
package loops;
import java.util.Scanner;
public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loop: for(int i = 1;i <= 50; i++) { //labeling the loop
            if(i % 3 == 0) {
                continue loop;
            }
            else {
                System.out.println(i);
            }
        }
    }
}

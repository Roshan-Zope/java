//calculate profit or loss
package conditionals;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        double cp = sc.nextDouble();
        System.out.println("Enter selling price : ");
        double sp = sc.nextDouble();
        double income = sp - cp;
        if(cp < sp) {
            System.out.println("profit : "+income);
        }
        else if(cp > sp){
            System.out.println("loss : "+income);
        }
        else {
            System.out.println("Nor profit or loss");
        }
    }
}

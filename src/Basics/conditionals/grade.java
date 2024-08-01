//print the grade according to percentage
package conditionals;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage marks : ");
        double marks = sc.nextDouble();
        if(marks > 90.99 && marks < 100) {
            System.out.println("Grade : Excellent ");
        }
        else if(marks > 80.99 && marks < 91) {
            System.out.println("Grade : Very good ");
        }
        else if(marks > 70.99 && marks < 81) {
            System.out.println("Grade : Good");
        }
        else if(marks > 60.99 && marks < 71) {
            System.out.println("Grade : Can do batter");
        }
        else if(marks > 50.99 && marks < 61) {
            System.out.println("Grade : Average");
        }
        else if(marks > 40.99 && marks < 51) {
            System.out.println("Grade : Below average");
        }
        else if(marks < 40) {
            System.out.println("Grade : Fail");
        }
        else {
            System.out.println("Invalid marks");
        }
    }
}

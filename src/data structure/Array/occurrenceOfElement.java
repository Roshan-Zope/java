// count the occurrence of a particular element x
package Array;
import java.util.Scanner;
public class occurrenceOfElement {
    static int occurrence(int[] arr, int x) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x : ");
        int x = sc.nextInt();

        System.out.println("Occurrence of "+x+" in array is "+occurrence(arr,x)+" times");
    }
}

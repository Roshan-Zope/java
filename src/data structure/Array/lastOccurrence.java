//find the last occurrence of an element x in a given array
package Array;
import java.util.Scanner;
public class lastOccurrence {
    static int lastOccurrence(int[] arr,int x) {
        int last_index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                last_index = i;
            }
        }
        return last_index;
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

        System.out.println("last occurrence of "+x+" in an array at index : "+lastOccurrence(arr,x));
    }
}

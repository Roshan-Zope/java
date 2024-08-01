package Array;
import java.util.Arrays;
import java.util.Scanner;

public class smallestAndLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Smallest number in array is : "+arr[0]);
        System.out.println("Largest number in array is : "+arr[size-1]);
    }
}

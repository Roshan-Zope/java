/*Given an array 'a', return the prefix sum/running sum in the same array*/
package Array;

import java.util.Scanner;

public class prefixSum1 {

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+ n +" elements :: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Original array :: ");
        printArray(arr);
        prefixSum(arr);
        System.out.println("PrefixSum array :: ");
        printArray(arr);
    }
}
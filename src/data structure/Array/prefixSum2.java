/*Given an array of integer of size n. Answer q queries where you need to print the sum of values in a given range of
* indices from l to r (both included).*/
package Array;

import java.util.Scanner;

public class prefixSum2 {

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array :: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+ n +" elements :: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Original Array :: ");
        printArray(arr);
        int[] ans = prefixSum(arr);

        System.out.println("Enter number of queries :: ");
        int q = sc.nextInt();

        while(q-- > 0) {
            System.out.println("Enter range (0-based indexing) :: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = ans[r] - ans[l - 1];
            System.out.print("sum :: " + sum);
            System.out.println();
        }
    }
}

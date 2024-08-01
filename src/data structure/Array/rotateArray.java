//rotate the given array by k steps
package Array;

import java.util.Scanner;

public class rotateArray {
    static void rotate_array(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;

        for(int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for(int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }

        System.out.println("Rotated array by "+k+" times : ");
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k to rotate array : ");
        int k = sc.nextInt();
        rotate_array(arr,k);
    }
}

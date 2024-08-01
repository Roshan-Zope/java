/*Given an integer array 'a' sorted in increasing order, return an array of the squares of each number sorted in increasing number*/
package Array;

import java.util.Scanner;

public class problem1 {

    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        int k = 0;

        while(left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+ n + " elements :: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Original Array :: ");
        printArray(arr);
        int[] ans = sortedSquares(arr);
        System.out.println("Sorted array :: ");
        reverseArray(ans);
        printArray(ans);
    }
}

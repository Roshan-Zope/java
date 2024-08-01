package algorithms;

import java.util.*;

public class bubble_sort {

    static void printArray(int[] arr, int n, int i) {
        if (i == n) {
            return;
        }
        System.out.print(arr[i] + " ");
        printArray(arr, n, i+1);
    }
    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        printArray(arr,n,0);
        System.out.println();
        System.out.println("Sorted array: ");
        bubbleSort(arr, n);
        printArray(arr, n, 0);
    }
}

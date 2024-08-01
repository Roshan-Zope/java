package algorithms;

import java.util.*;

public class selection_sort {
    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: ");
        algorithms.bubble_sort.printArray(arr, n, 0);
        selectionSort(arr,n);
        System.out.println();
        System.out.print("Sorted Array: ");
        algorithms.bubble_sort.printArray(arr, n, 0);
    }
}

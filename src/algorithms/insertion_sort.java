package algorithms;

import java.util.*;
public class insertion_sort {

    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
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
        insertionSort(arr, n);
        System.out.println();
        System.out.print("Sorted Array: ");
        algorithms.bubble_sort.printArray(arr, n, 0);
    }
}

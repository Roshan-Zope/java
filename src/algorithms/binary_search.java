package algorithms;

import java.util.*;

public class binary_search {

    static void binarySearch(int[] arr, int n, int key) {
        int first  = 0, last = n-1;

        while (first > last) {
            int mid = (first+last)/2;

            if (arr[mid] == key) {
                System.out.println(key+ "found at index " + mid);
            } else if (arr[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        if (first >= last) {
            System.out.println(key + " not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter an element which you want to search: ");
        int key = sc.nextInt();
        System.out.print("Original array: ");
        algorithms.bubble_sort.printArray(arr,n,0);
        System.out.println();
        algorithms.insertion_sort.insertionSort(arr, n);
        System.out.print("Sorted array: ");
        algorithms.bubble_sort.printArray(arr,n,0);
        binarySearch(arr,n,key);
    }
}

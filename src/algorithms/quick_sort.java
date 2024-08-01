package algorithms;

import java.util.*;

public class quick_sort {

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int count = 0;

        for(int i = left+1; i <= right; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }
        int pivot_index = left+count;
        swap(arr,left,pivot_index);

        int i = left, j = right;
        while (i < pivot_index && j > pivot_index) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i < pivot_index && j > pivot_index) {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivot_index;
    }
    public static void QuickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot_index = partition(arr,left,right);
        QuickSort(arr,left,pivot_index-1);
        QuickSort(arr,pivot_index+1,right);
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
        algorithms.bubble_sort.printArray(arr,n,0);
        QuickSort(arr,0,n-1);
        System.out.println();
        System.out.print("Sorted array: ");
        algorithms.bubble_sort.printArray(arr,n,0);
    }
}

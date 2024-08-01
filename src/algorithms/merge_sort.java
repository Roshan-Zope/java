package algorithms;

import java.util.*;

public class merge_sort {

    static void merge(int[] arr, int f, int mid, int l) {
        int aN = mid-f-1, bN = l-mid;
        int[] a = new int[aN];
        int[] b = new int[bN];
        int i,j,k;

        for (i = 0; i < aN; i++) {
            a[i] = arr[f+i];
        }
        for (j = 0; j < bN; j++) {
            b[j] = arr[mid+1+j];
        }
        i = 0;
        j = 0;
        k = f;

        while (i < aN && j < bN) {
            if (a[i] < b[j]) {
                arr[k++] = a[i++];
            }
            else {
                arr[k++] = b[j++];
            }
        }

        while (i < aN) {
            arr[k++] = a[i++];
        }
        while (j < bN) {
            arr[k++] = b[j++];
        }
    }

    static void mergeSort(int[] arr, int f, int l) {
        if (f > l) {
            return;
        }
        int mid = (f + l)/2;
        mergeSort(arr,f,mid);
        mergeSort(arr,mid+1,l);
        merge(arr,f,mid,l);
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
        mergeSort(arr,0,n-1);
        System.out.println();
        System.out.print("Sorted Array: ");
        algorithms.bubble_sort.printArray(arr, n, 0);
    }
}

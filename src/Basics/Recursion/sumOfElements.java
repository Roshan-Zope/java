/*
 * 1,2,3,4,5  sum(arr, 0)
 * 2,3,4,5    sum(arr, idx + 1)
 * 3,4,5      sum(arr, idx + 2)
 * 4,5        sum(arr, idx + 3)
 * 5          sum(arr, idx + 4)

 * return arr[idx] + sum(arr, idx + 1)
 * if(idx == arr.length - 1) return arr[idx}
 */
package Recursion;

import java.util.*;

public class sumOfElements {

    static void printArray(int[] arr, int idx) {

        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

    static int sum(int[] arr, int idx) {

        if(idx == arr.length - 1) return arr[idx];
        return arr[idx] + sum(arr, idx + 1);
    }

    public static void main(String[] args) {

        int[] arr = {2,3,5,20,1};
        System.out.print("Original Array :: ");
        printArray(arr, 0);
        System.out.println();
        System.out.print("Sum of elements of array :: " + sum(arr, 0));
    }
}

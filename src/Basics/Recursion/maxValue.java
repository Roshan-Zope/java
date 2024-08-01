/*
    * Print the max value of the array [3,10,3,2,5].
*/
package Recursion;

import java.util.*;

public class maxValue {

    static void printArray(int[] arr, int idx) {

        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

    static int max(int[] arr, int idx) {

        if(idx == arr.length - 1) return arr[idx];
        return Math.max(arr[idx], max(arr, idx + 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {3,10,3,2,5};
        System.out.print("Original Array :: ");
        printArray(arr, 0);
        System.out.println();
        System.out.print("Max value :: " + max(arr, 0));
    }
}

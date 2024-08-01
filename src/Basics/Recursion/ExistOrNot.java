/*
    * Given an array of n integer and a target value x. Print whether x exist in the array or not.
    * Constraints : 0 <= n <= 10^6, 10^-8 <= x <= 10^8, 10^-8 = <= arr[i] <= 10^8
    * Input : arr = {4,12,54,14,3,8,6,1}, x = 14
    * Output : True

    * 4,12,54,14,3,8,6,1  find(arr, 0 , x)
    * 12,54,14,3,8,6,1    find(arr, idx + 1, x)
    * 54,14,3,8,6,1       find(arr, idx + 2, x)
    * 14,3,8,6,1          find(arr, idx + 3, x)
    * 3,8,6,1             find(arr, idx + 4, x)
    * 8,6,1               find(arr, idx + 5, x)
    * 6,1                 find(arr, idx + 6, x)
    * 1                   find(arr, idx + 7, x)

    * if(idx >= arr.length) return false;
    * if(arr[idx) == x) return true;
    * return find(arr, idx + 1, x);
*/
package Recursion;

import java.util.*;

public class ExistOrNot {

    static void printArray(int[] arr, int idx) {

        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

    static boolean find(int[] arr, int idx, int x) {

        if(idx >= arr.length) return false;
        if(arr[idx] == x) return true;
        return find(arr, idx + 1, x);
    }

    static int findIndex(int[] arr, int idx, int x) {

        if(idx >= arr.length) return -1;
        if(arr[idx] == x) return idx;
        return findIndex(arr, idx + 1, x);
    }

    public static void main(String[] args) {

        int[] arr = {4,12,54,14,3,8,6,1};
        int x = 14;
        System.out.print("Original Array :: ");
        printArray(arr, 0);
        System.out.println();
        System.out.print("Target :: " + x);
        System.out.println();
        System.out.print(find(arr, 0, x));
        System.out.println();
        System.out.print("Index :: " + findIndex(arr, 0, x));
    }
}

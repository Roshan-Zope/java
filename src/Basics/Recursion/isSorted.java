/*
    * Given an array of size N. check if is sorted or not.
    * Input 1 : arr = {1,4,6,3,2}
    * Output 1 : false
    * Input 2 : arr = {1,2,3,4,5}
    * Output 2 : true

    * 1,4,6,3,2  is_sorted(arr, 0)
    * 4,6,3,2    is_sorted(arr, idx + 1)
    * 6,3,2      is_sorted(arr, idx + 2)
    * 3,2        is_sorted(arr, idx + 3)
    * 2          is_sorted(arr, idx + 4)

    * if array has only one element or empty then it is sorted.
    * if arr[size - 2] > arr[size - 1] then array is not sorted.
    * is_sorted(arr, size - 1)
*/
package Recursion;

public class isSorted {

    static void printArray(int[] arr, int idx) {

        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

    static boolean is_sorted(int[] arr, int n) {

        if(n <= 1) return true;
        if(arr[n - 2] > arr[n - 1]) return false;
        return is_sorted(arr, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.print("Original Array :: ");
        printArray(arr, 0);
        System.out.println();
        System.out.print("Is sorted :: " + is_sorted(arr, arr.length));
    }
}

/*
    * Given an array of N integers and X target. Find the last index of target in array.
    * Input : arr = {1,3,8,3,3,2} X = 3
    * Output : 4

    * 2,3,3,8,3,1  findLastIndex(arr, x, size-1)
    * 3,3,8,3,1    findLastIndex(arr, x, size-2)
    * 3,8,3,1      findLastIndex(arr, x, size-3)
    * 8,3,1        findLastIndex(arr, x, size-4)
    * 3,1          findLastIndex(arr, x, size-5)
    * 1            findLastIndex(arr, x, size-6)

    * if idx < 0 return 0;
    * if(arr[idx] == x) return idx;
    * findLastIndex(arr, x, n - 1)
*/

package Recursion;

public class lastIndex {

    static void printArray(int[] arr, int idx) {

        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

    static int findLastIndex(int[] arr, int x, int idx) {

        if(idx < 0) return 0;
        if(arr[idx] == x) return idx;
        return findLastIndex(arr, x, idx - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1,3,8,3,3,2};
        int x = 3;
        System.out.print("Original Array :: ");
        printArray(arr, 0);
        System.out.println();
        System.out.print("last index of " + x + " in array :: " + findLastIndex(arr, x, arr.length - 1));
    }
}

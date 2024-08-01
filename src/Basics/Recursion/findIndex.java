/*
    * Given an array of size N and an integer X. The task is to find all the indices of the integer X in the array

    * Input : arr = {1,2,3,2,2,5} , X = 2
    * Output : 1 3 4

    * 1,2,3,2,2,5  printIndices(arr, x, 0)
    * 2,3,2,2,5    printIndices(arr, x, 1dx + 1)
    * 3,2,2,5      printIndices(arr, x, idx + 2)
    * 2,2,5        printIndices(arr, x, idx + 3)
    * 2,5          printIndices(arr, x, idx + 4)
    * 5            printIndices(arr, x, idx + 5)

    * idx >= arr.length return;
    * arr[idx] == x return idx;
    * findIndices(arr, x, idx + 1)
*/
package Recursion;

public class findIndex {

    static void printArray(int[] arr, int idx) {

        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

    static void findIndices(int[] arr, int x, int idx) {

        if(idx >= arr.length) return;
        if(arr[idx] == x) System.out.print(idx + " ");
        findIndices(arr, x, idx + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,2,5};
        int x = 2;
        System.out.print("Original Array :: ");
        printArray(arr, 0);
        System.out.println();
        System.out.print("Target :: " + x);
        System.out.println();
        System.out.print("Indices :: ");
        findIndices(arr, x, 0);
    }
}

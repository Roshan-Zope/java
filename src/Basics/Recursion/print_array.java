package Recursion;

import java.util.*;

public class print_array {

    static void printArray(int[] arr, int idx) {

        //base case
        if(idx == arr.length) return;

        //self work
        System.out.print(arr[idx] + " ");

        //recursive work
        printArray(arr, idx + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements :: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array :: ");
        printArray(arr, 0);
    }
}

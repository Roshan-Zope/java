package algorithms;

import java.util.*;
public class linear_search {

    static void linearSearch(int[] arr, int n, int key) {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println(key+" found at index: "+i);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println(key+" not found");
        }
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
        System.out.println("Enter key which you want to search: ");
        int key = sc.nextInt();
        System.out.print("Original array: ");
        algorithms.bubble_sort.printArray(arr,n,0);
        System.out.println();
        linearSearch(arr, n, key);
    }
}

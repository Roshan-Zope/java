package Array;

import java.util.Scanner;

public class zerosAndOnes {
    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    static void sortZerosAndOnes(int[] arr) {
//        int n = arr.length;
//        int zeroes  = 0;
//        // count number of zeroes
//        for(int i = 0; i < n; i++) {
//            if(arr[i] == 0) {
//                zeroes++;
//            }
//        }
//
//        //0 to zeroes - 1 : 0 :: zeroes to n - 1 : 1
//        for(int i = 0; i < n; i++) {
//            if(i < zeroes) {
//                arr[i] = 0;
//            }
//            else {
//                arr[i] = 1;
//            }
//        }
//    }

    static void sortArrayUsingPointer(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while(left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] == 0) {
                left++;
            }
            if(arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+ n +" elements :: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array :: ");
        printArray(arr);

        sortArrayUsingPointer(arr);
        System.out.println("sorted array using pointers :: ");
        printArray(arr);
    }
}

package Array;

import java.util.Scanner;

public class secondLargest {
    static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondLargest(int[] arr) {
        int max = findLargest(arr);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findLargest(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second largest number in array is : "+secondLargest(arr));
    }
}

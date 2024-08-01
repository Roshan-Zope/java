package Array;

import java.util.Scanner;

public class isSorted {
    static boolean isSorted(int[] arr) {
        boolean check = true;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Is sorted : "+isSorted(arr));
    }
}

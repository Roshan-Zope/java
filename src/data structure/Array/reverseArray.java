package Array;

import java.util.Scanner;

public class reverseArray {
    static void reverse_array(int[] arr) {
        int temp = 0;
        int i = 0;
        int j = arr.length-1;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Reversed array : ");
        for(i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
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

        reverse_array(arr);
    }
}

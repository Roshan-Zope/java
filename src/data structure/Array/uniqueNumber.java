//find the unique numbers in a given array where all the elements are being repeat twice with one value being unique
package Array;

import java.util.Scanner;

public class uniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int index = 0;
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                ans = arr[i];
                index = i;
            }
        }
        System.out.println(ans+" is unique number present in array at "+index+" index");
    }
}

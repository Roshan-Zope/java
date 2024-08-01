//find the total number of pairs in the array whose sum is equal to the given value x
package Array;

import java.util.Scanner;

public class noOfpairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum : ");
        int targetSum = sc.nextInt();
        int pairs = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if((arr[i] + arr[j]) == targetSum) {
                    pairs++;
                }
            }
        }
        System.out.println("Number of pairs having sum equal to "+targetSum+" is "+pairs);
    }
}

package Array;

import java.util.Scanner;

public class tripleOfPairs {
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

        int triple = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                for(int k = j+1; k < arr.length; k++) {
                    if((arr[i] + arr[j] + arr[k]) == targetSum) {
                        triple++;
                    }
                }
            }
        }
        System.out.println("Number of triples having sum equal to "+targetSum+" is "+triple);
    }
}

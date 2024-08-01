package Array;

import java.util.Scanner;

public class strictlyGreater {
    static int greater(int[] arr, int x) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x : ");
        int x = sc.nextInt();

        System.out.println(greater(arr,x)+" number present in an array which is greater than "+x);
    }
}

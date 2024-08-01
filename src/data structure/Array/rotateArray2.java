package Array;

import java.util.Scanner;

public class rotateArray2 {
    static void reverse_array(int[] arr,int i, int j) {
        int temp = 0;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k to rotate : ");
        int k = sc.nextInt();

        reverse_array(arr,0,n-k-1);
        reverse_array(arr,n-k,n-1);
        reverse_array(arr,0,n-1);
        System.out.println("Array after "+k+" rotation : ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

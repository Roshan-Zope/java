//given an array consisting of integer. return the first value that is repeating in this array.
// if no value is being repeated return -1.
package Array;

import java.util.Scanner;

public class firstRepeatValue {
    static int firstRepeat(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
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

        System.out.println(firstRepeat(arr)+" is a first value which is repeating in array");
    }
}

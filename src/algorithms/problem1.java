package algorithms;

/*
*   Given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non zero elements
* Input: 0 5 0 3 42
* Output: 5 3 42 0 0
* */

public class problem1 {
    public static void sort(int[] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[j] < 1) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,5,0,3,42};
        sort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

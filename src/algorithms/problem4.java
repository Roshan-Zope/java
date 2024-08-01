package algorithms;
/*
*   Given an array of size N containing only 0s, 1s, and 2s. sort the array in ascending order. maintain linear time complexity
*   Input: N = 6
*   arr[] = {0,2,1,2,0,0}
*   Output: 0 0 0 1 2 2
* */
public class problem4 {
    public static void sort(int[] arr) {
        int count_0 = 0, count_1 = 0, count_2 = 0;
        for (int i: arr) {
            if (arr[i] == 0) {
                count_0++;
            } else if (arr[i] == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }
        int j = 0;
        while (count_0 > 0) {
            arr[j++] = 0;
            count_0--;
        }
        while (count_1 > 0) {
            arr[j++] = 1;
            count_1--;
        }
        while (count_2 > 0) {
            arr[j++] = 2;
            count_2--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0,0};
        int n = 6;
        sort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

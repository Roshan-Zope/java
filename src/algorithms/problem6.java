package algorithms;
/*
*   Given the sorted array of integers, which contains distinct element, and an integer target returns the index of target if it is in the array. Otherwise return -1
*   Input: 3 4 5 1 2, target = 4
*   Output: 1
* */
public class problem6 {
    public static int search(int[] a, int k) {
        int idx = -1, n = a.length, f = 0, l = n-1;
        while (f <= l) {
            int mid = (f+l)/2;
            if (a[mid] >= k) {
                l = mid-1;
                idx = mid;
            } else {
                f = mid+1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int target = 4;
        System.out.println(search(arr, target));
    }
}

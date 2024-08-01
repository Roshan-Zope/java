package algorithms;
/*
*   A sorted array on which rotation operation has been performed some number of times. Given a rotated sorted array. find the index of minimum element
*   the array. follow 0 based indexing. all elements in array are unique
* */
public class problem5 {
    public static int search(int[] arr) {
        int n = arr.length,idx = -1,f = 0,l = n-1;
        while (f <= l) {
            int mid = (f+l)/2;
            if (arr[mid] <= arr[l]) {
                idx = mid;
                l = mid - 1;
            } else {
                f = mid+1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(search(arr));
    }
}

package algorithms;
/*
*   search element in rotated sorted array with duplicate elements. return true if the element id found, else return false
*   Input: [0,0,0,1,1,1,2,0,0,0], target = 2
*   Output: target = 2
* */
public class problem7 {
    public static boolean search(int[] a, int k) {
        int n = a.length, f = 0, l = n-1;
        while (f <= l) {
            int mid = (f+l)/2;
            if (a[mid] == k) return true;
            else if (a[mid] == a[l]) {
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,2,0,0,0};
        int target = 2;
        if (search(arr,target)) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}

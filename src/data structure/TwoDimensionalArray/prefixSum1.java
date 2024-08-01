/*
    * Given a matrix 'a' of dimensions r X c and 2 coordinates (l1, r1) and (l2, r2). Return the sum of the rectangle
    * from (l1, r1) to (l2, r2).
    * l2 > l1 && r2 > r1
    * 0 <= l1 && l2 < r
    * 0 <= r1 && r2 < c
*/

package TwoDimensionalArray;

import java.util.Scanner;

public class prefixSum1 {

    static void printArray(int[][] matrix, int r, int c) {

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {

        int sum = 0;
        for(int i = l1; i <= l2; i++) {
            for(int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix :: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Enter " + r*c +" elements :: ");
        int[][] matrix = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries l1, r1, l2, r2 :: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Original matrix :: ");
        printArray(matrix, r, c);

        System.out.println("Rectangle Sum :: " + findSum(matrix, l1, r1, l2, r2));
    }
}

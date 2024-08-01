package TwoDimensionalArray;

import java.util.Scanner;

public class multiplyMatrix {

    static void readArray(int[][] arr, int r, int c) {

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void printArray(int[][] arr, int r, int c) {

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplicationOfMatrix(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {

        if(c1 != r2) {
            System.out.println("Multiplication is not possible - wrong dimensions");
            return;
        }

        int[][] ans = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c2; k++) {
                    ans[i][j]  += (arr1[i][k] * arr2[k][j]);
                }
            }
        }

        System.out.println("Multiplication :: ");
        printArray(ans, r1, c2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of matrix 1 :: ");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns of matrix 1 :: ");
        int c1 = sc.nextInt();
        System.out.println("Enter number of rows of matrix 2 :: ");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns of matrix 2 :: ");
        int c2 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter "+ r1 +" X "+ c1);
        System.out.println("Matrix 1 :: ");
        readArray(arr1, r1, c1);
        System.out.println("Matrix 2 :: ");
        readArray(arr2, r2, c2);

        System.out.println("Matrix 1 :: ");
        printArray(arr1, r1, c1);
        System.out.println("Matrix 2 :: ");
        printArray(arr2, r2, c2);

        System.out.println("Multiplication :: ");
        multiplicationOfMatrix(arr1, r1, c1, arr2, r2, c2);
    }
}

package TwoDimensionalArray;

import java.util.Scanner;

public class additionOfMatrix {

    static void readArray(int[][] arr) {

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void printArray(int[][] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] addMatrix(int[][] arr1, int[][] arr2, int r, int c) {

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of matrix :: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns of matrix :: ");
        int c = sc.nextInt();

        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];

        System.out.println("Enter "+ r +" X "+ c);
        System.out.println("Matrix : 1 :: ");
        readArray(arr1);
        System.out.println("Matrix : 2 :: ");
        readArray(arr2);

        System.out.println("Matrix 1 :: ");
        printArray(arr1);
        System.out.println("Matrix 2 :: ");
        printArray(arr2);

        addMatrix(arr1, arr2, r, c);
        System.out.println("Addition :: ");
        printArray(arr1);
    }
}
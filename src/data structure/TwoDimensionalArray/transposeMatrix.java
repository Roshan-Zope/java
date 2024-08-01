package TwoDimensionalArray;

import java.util.Scanner;

public class transposeMatrix {

    static void printMatrix(int[][] matrix, int r, int c) {

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose_matrix(int[][] matrix, int r, int c) {

        for(int i = 0; i < r; i++){
            for(int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of matrix :: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns of matrix :: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter "+ r + " X "+ c +" Matrix :: ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix :: ");
        printMatrix(matrix, r, c);

        transpose_matrix(matrix, r, c);
        System.out.println("Transpose Matrix :: ");
        printMatrix(matrix, r, c);
    }
}

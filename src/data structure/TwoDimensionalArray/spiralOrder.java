package TwoDimensionalArray;

import java.util.Scanner;

public class spiralOrder {

    static void printMatrix(int[][] matrix, int r, int c) {

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiral_order(int[][] arr, int r, int c) {

        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;

        while(totalElements < (r * c)) {

            //topRow -> leftCol to rightCol
            for(int j = leftCol; j <= rightCol && totalElements < (r * c); j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            //rightCol -> topRow to bottomRow
            for(int i = topRow; i <= bottomRow && totalElements < (r * c); i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol
            for(int j = rightCol; j <= leftCol && totalElements < (r * c); j++) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow
            for(int i = bottomRow; i <= topRow && totalElements < (r * c); i++) {
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
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

        System.out.println("Spiral order :: ");
        spiral_order(matrix, r, c);
    }
}

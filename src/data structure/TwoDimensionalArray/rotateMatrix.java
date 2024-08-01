/*Given an square matrix turn it by 90 degree in a clockwise direction without using any extra space*/
package TwoDimensionalArray;

import java.util.Scanner;

public class rotateMatrix {

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

    static void rotate_matrix(int[][] matrix, int n) {

        for(int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
    }

    static void reverseArray(int[] arr) {

        int left = 0, right = arr.length - 1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
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
        System.out.println("Rotate matrix :: ");
        rotate_matrix(matrix, r);
        printMatrix(matrix, r, c);
    }
}

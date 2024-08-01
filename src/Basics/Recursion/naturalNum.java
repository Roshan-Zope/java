package Recursion;

import java.util.Scanner;

public class naturalNum {

    // print all natural number from 1 to n
    static void natural_Num(int n) {

        if(n == 1) {
            System.out.print(1 + " ");
            return;
        }

        natural_Num(n - 1);
        System.out.print(n + " ");
    }

    // print all natural number from n to 1
    static void natural_num2(int n) {

        if(n == 1) {
            System.out.print(1 + " ");
            return;
        }

        System.out.print(n + " ");
        natural_num2(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :: ");
        int n = sc.nextInt();
        natural_Num(n);
        System.out.println();
        natural_num2(n);
    }
}

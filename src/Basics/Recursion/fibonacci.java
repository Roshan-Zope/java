package Recursion;

import java.util.Scanner;

public class fibonacci {

    static int fib(int n) {

        // base case
        if(n == 0 || n == 1) return n;

        return fib(n - 1) + fib(n - 2);

//        //sub problem
//        int prev = fib(n -1);
//        int prevPrev = fib(n - 2);
//
//        //self work
//        return prev + prevPrev;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(fib(i));
        }
    }
}

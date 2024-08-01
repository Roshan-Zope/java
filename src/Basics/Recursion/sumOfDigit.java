package Recursion;

import java.util.Scanner;

public class sumOfDigit {

    static int sum(int n) {

        //base condition
        if((n >= 0) && (n <= 9)) return n;

        //recursive work
        return sum(n/10) + n%10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :: ");
        int n = sc.nextInt();

        System.out.println("Sum of digit of " + n + " :: " + sum(n));
    }
}

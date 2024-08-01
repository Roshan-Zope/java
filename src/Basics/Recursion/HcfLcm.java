/*
    *Given two numbers x and y. Find the greatest common divisor (GCD) of x and y using recursion.
    * constraints : 0 <= x, y <= 10^6
    * Input : x = 4, y = 9
    * Output : 1
*/
package Recursion;

import java.util.*;

public class HcfLcm {

    static int GCD(int x, int y) {

        if(y == 0) return x;

        return GCD(y, x % y);
    }

    static int LCM(int x, int y) {

        return (x * y)/(GCD(x, y));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x :: ");
        int x = sc.nextInt();
        System.out.print("Enter y :: ");
        int y = sc.nextInt();

        System.out.println("GCD :: " + GCD(x, y));
        System.out.print("LCM :: " + LCM(x, y));
    }
}

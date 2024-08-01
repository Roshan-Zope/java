/*
    * Given two number p & q. find the value of p^q using recursive function
*/
package Recursion;

import java.util.*;

public class power {

    static int Power(int p, int q) {

        //base condition
        if(q == 0) return 1;

        return (p * Power(p, q - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p :: ");
        int p = sc.nextInt();
        System.out.println("Enter q :: ");
        int q = sc.nextInt();

        System.out.println("p ^ q :: " + Power(p, q));
    }
}

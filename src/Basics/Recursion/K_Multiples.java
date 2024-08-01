/*
    *Given a number num and a value k. Print k multiples of num.
    * constraints : k > 0;
    * Input : num = 12 , k = 5
    * Output : 12 24 36 48 60

    * 2 x 1 = 2  n = 2, k = 1
    * 2 x 2 = 4  n = 2, k = 2
    * 2 x 3 = 6  n = 2, k = 3
    * 2 x 4 = 8  n = 2, k = 4
    * 2 x 5 = 10 n = 2, k = 5
*/
package Recursion;

import java.util.*;

public class K_Multiples {

    static void multiples(int num, int k) {

        if(k == 0) return;

        multiples(num, k - 1);
        System.out.print(num * k + " ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :: ");
        int num  = sc.nextInt();
        System.out.print("Enter k :: ");
        int k = sc.nextInt();

        multiples(num, k);
    }
}
/*
    *Given a number n. Find the sum of natural number till n but with alternate sign
    * That means if n = 10, then you have to return the sum of 1 - 2 + 4 - 5 + 6 - 7 + 8 - 9 + 10. Which is equal to -5.
    * Constraints : 0 <= n <= 10^6
*/
package Recursion;

import java.util.*;

public class alternateSeries {

    static int sum(int n) {

        //base case
        if(n == 0) return 0;

        if(n % 2 != 0) return sum(n - 1) + n;
        else return sum(n - 1) - n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms :: ");
        int n = sc.nextInt();

        System.out.print("Sum of series :: " + sum(n));
    }
}

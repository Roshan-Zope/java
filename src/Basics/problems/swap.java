package Basics;

import java.util.Scanner;

public class swap {
    static void Swap(int a ,int b) {
        System.out.println("Before swap");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        Swap(a,b);
    }
}

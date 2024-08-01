package Basics;

import java.util.Scanner;

public class swap2 {
    static void swap(int a,int b) {
        System.out.println("Before swaping ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("After swaping ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        swap(a,b);
    }
}

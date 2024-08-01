package exceptionHandeling;

import java.util.Scanner;

public class Basics {
    public static void fun1() throws IllegalAccessException {
        System.out.println("Inside fun1 method");
        throw new IllegalAccessException("Demo");
    }
    public static void fun() {
        try {
            throw new NullPointerException("invalid index"); // throw keyword is used to throw exception explicitly
        } catch(NullPointerException e) {
            System.out.println("caught in fun method");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[] {0,1,2,3};

            // try block will try to execute the statement inside it. but when the exception occur it will shift the flow to catch block
            // means throw the exception to catch block
        try {
            System.out.println(a/b);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible. "+e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound "+e);
        } catch (Exception e) {
            // if we don't know what kind of exception is in our code then this block throw general exception
            System.out.println(e);
        }

        System.out.println("a : "+a+" b: "+ b);

        // case 1: a = 10, b = 5;
        // in this case the division is possible so, it will execute the try block
        // case 2: a = 10, b = 0;
        // in this case the division is not possible, so it will execute catch block

        try {
            fun();
        } catch(NullPointerException e) {
            System.out.println("caught in main method");
        }

        try {
            fun1();
        } catch(IllegalAccessException e) {
            System.out.println("Inside main method" + e);
        }
    }
}

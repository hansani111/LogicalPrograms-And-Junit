package com.bridgelabz.logical;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int number = sc.nextInt();
        int x = 0;
        int y = 1;
        int nextNumber;
        System.out.println("Fibonaccie Series Start");
        if (number == 1) {
            System.out.println(x);
        } else if (number == 2) {
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(x);
            System.out.println(y);
            for (int i = 1; i <= number - 2; i++) {
                nextNumber = x + y;
                System.out.println("" + nextNumber);
                x = y;
                y = nextNumber;
            }
            System.out.println("Fibonaccie Series End");
        }
    }
}
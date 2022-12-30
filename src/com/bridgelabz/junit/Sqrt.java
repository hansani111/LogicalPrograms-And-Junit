package com.bridgelabz.junit;

import java.util.Scanner;

public class Sqrt {

    public static double squareRoot(int num) {
        double t;
        double sqrtroot = num / 2;
        if(num<0){
            System.out.println("the number cannot be less than zero");
            System.exit(0);
        }
        do {
            t = sqrtroot;
            sqrtroot = (t + (num / t)) / 2;
        }
        while ((t - sqrtroot) != 0);
        return sqrtroot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find it's squre root : ");
        int num = sc.nextInt();
        System.out.println("the square root of the number "+squareRoot(num) );
    }
}
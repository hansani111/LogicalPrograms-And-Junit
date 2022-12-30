package com.bridgelabz.logical;

import java.util.Scanner;
// num = 6 = (1+2+3) =6 (factor divisible by num)
public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;
        int num = number;
        for (int i = 1; i < num - 1; i++) {
            if (num % i == 0) {
                sum = sum + i;
//				System.out.println("i=" +i);
//				System.out.println("sum="+sum);
            }
        }
        if (sum == number) {
            System.out.println("The number is a Perfect Number");
        } else {
            System.out.println("The number is not a Perfect Number");
        }
    }
}
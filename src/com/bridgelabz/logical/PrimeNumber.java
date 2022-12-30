package com.bridgelabz.logical;

import java.util.Scanner;
/*
Prime number is a number that is greater than 1 and divided by 1 or itself only.
prime numbers can't be divided by other numbers than itself or 1.
For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
0 and 1 are not prime numbers.
*/
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");
        int number = sc.nextInt();

        boolean prime = true;

        if(number < 2)
        {
            prime = false;
        }
        else
        {
            for(int i=2; i <= number/2; i++)
            {
                if(number % i == 0)
                {
                    prime = false;
                    break;
                }
            }
        }
        String check = prime ? "is a Prime number" : "is not a Prime number";
        System.out.println (number +" "+ check);
    }
}
//flag==true
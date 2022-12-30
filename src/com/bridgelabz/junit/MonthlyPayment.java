package com.bridgelabz.junit;

public class MonthlyPayment {

    public static void main(String[] args) {

        double p = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        double n = 12 * y;
        double r1 = r / (12 * 100);
        double payment = p * r / (1 - (Math.pow((1 + r1),(-n))));
        System.out.println("monthly Payment = "+payment);
    }
}

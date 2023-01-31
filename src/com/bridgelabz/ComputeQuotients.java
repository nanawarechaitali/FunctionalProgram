package com.bridgelabz;

import java.util.Scanner;

public class ComputeQuotients {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter divisor:");
        int div =sc.nextInt();

        int rem = num%div;
        int quotient = num/div;
        System.out.println("Quotient " + quotient);
        System.out.println("Reminder" +rem);
    }
}

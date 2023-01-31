package com.bridgelabz;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double result = 0.0;
        for(int i=num;i>0;i--){
            result = result +(double)1/i;
            System.out.println(result + " ,");
        }
    }
}

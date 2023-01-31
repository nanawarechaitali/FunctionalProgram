package com.bridgelabz;
import java.util.Scanner;
public class SwappingNumbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter num1");
       int num1 = sc.nextInt();

        System.out.println("Enter num2");



        int num2 = sc.nextInt();

        System.out.println("Before Swapping numbers are:");
        System.out.println("The first numb is : " + num1);
        System.out.println("The second num is: " + num2);


        int  temp=0;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping numbers are:");
        System.out.println("Enter num1 is :" +num1);
        System.out.println("Enter num2 is :" +num2);

    }
}

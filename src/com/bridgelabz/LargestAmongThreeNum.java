package com.bridgelabz;

import java.util.Scanner;

public class LargestAmongThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number");
        int num1 = sc.nextInt();
        System.out.println("Second Number");
        int num2 = sc.nextInt();
        System.out.println("Third Number");
        int num3 = sc.nextInt();



        if(num1>num2){
            if(num1>num3){
                System.out.println("First number is greatest" +num1);

            }else{
                    System.out.println("Third number is greatest: " +num3);
            }
        }else{
            if(num2>num3){
                System.out.println("Second number is greatest" +num2);
            }else{
                System.out.println("Third number is greatest" +num3);
            }


        }


    }
}

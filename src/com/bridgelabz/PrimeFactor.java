package com.bridgelabz;
import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();


        int temp = num;
        for(int i=2; i*i<=temp;i++){

        while(num%i == 0){
                System.out.println(i);
                num = num/i;
            }

        }
        if(num>2){
            System.out.println(num);
        }
    }

}

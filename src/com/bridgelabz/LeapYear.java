package com.bridgelabz;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean leap = false;
        System.out.println("Enter year to be checked: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();


        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0)
                    leap = true;

            }
            leap = true;
        }
        System.out.println(year + " is a leap year? " +leap);

    }
}

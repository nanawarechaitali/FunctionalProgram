package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int heads =0;
        int tails=0;
        int count=1;
        double randum=0.0;

        System.out.println("Please enter the number : ");
        Scanner n = new Scanner(System.in);
        int flips =n.nextInt();

        while(count <= flips){

            randum=Math.random();
            System.out.println(count+" "+randum);

            if (randum<0.5){
                heads++;
                System.out.println("heads");

            }
            else{
                tails++;
                System.out.println("tails");


            }
            count++;


        }
        System.out.println();
        System.out.println("Number of heads :" +heads);
        System.out.println("Number of talis : "+tails);


        double headpercent = (double)heads/flips*100;
        double tailpercent = (double)tails/flips*100;

        System.out.println("percentage of heads " +headpercent);
        System.out.println("Percentage of tails " +tailpercent);


    }




}

package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // write your code here

        int a = 0;
        int b = 0;

        Scanner input = new Scanner(System.in);
        Random RandNum = new Random();

        System.out.println("enter a range of random number which is your starting score");
        int range = input.nextInt();
        int score = range;


        System.out.println("enter a difficulty:easy medium hard");
        String difficulty = input.next();

        if(difficulty.equals("easy")){
            a = -1;
            b = -1;
        }else{
            if(difficulty.equals("medium")){
                a= -5;
                b =-3;
            }else{
                if(difficulty.equals("hard")) {
                    a = -5;
                    b = -7;
                }else{
                    a = -10;
                    b = -10;
                    difficulty = "impossible";
                }
            }
        }


        int myRandNum = RandNum.nextInt(range);



        while(true){
            System.out.println("enter a Number:");
            int userNum = input.nextInt();

            if(userNum == myRandNum){
                System.out.println("Yes, that's it!");
                break;
            }else{
                if( userNum < myRandNum){
                    System.out.println("Your guess is lower than the hidden number");
                    score= score + a;
                }else{
                    System.out.println("Your guess is higher than the hidden number");
                    score = score + b;
                }
            }
        }

        System.out.println("score : "+ score);
        System.out.println("the random number was : "+myRandNum);
        System.out.println("difficulty: "+difficulty);
    }
}
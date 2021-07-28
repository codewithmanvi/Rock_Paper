package com.company;
import java.util.Scanner;
import java.util.Random;

public class CWM_RockPaperScissor {
    public static void main(String[] args) {

        //RockPaperScissorsGameUsingConditionals
        System.out.println("Let's play RockPaperScissor!!");
        System.out.println("Rules: 0-Rock, 1-Paper, 2-Scissor ");
        System.out.println("Enter any number among the above mentioned three numbers");
        Scanner digit = new Scanner(System.in);
        int user = digit.nextInt();

        Random num = new Random();
        int comp = num.nextInt(3);
        System.out.println(comp);

        if (user == comp) {
            System.out.println("It's a draw");
        }
        else if (user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1) {
            System.out.println("Congratulations you won!!");
        }
        else {
            System.out.println("Sorry you lost it. " + "Better luck next time!");
        }

        if (comp == 0) {
            System.out.println("Computer chose Rock");
        }
        else if (comp==1){
            System.out.println("Computer chose Paper");
        }
        else if (comp==2){
            System.out.println("Computer chose Scissor");
        }
    }
}
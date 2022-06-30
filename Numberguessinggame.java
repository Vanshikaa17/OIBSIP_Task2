package com.company;

import java.util.Random;
import java.util.Scanner;


public class Numberguessinggame {
    public static void main(String[] args){

        System.out.println("---------Welcome to the number guessing game---------");
        System.out.println("You have 7 guessing rounds after 7 guesses the game will terminate.");
        System.out.println(("Guess any number between 0-100: "));

        Random rand = new Random();
        int random_num = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int guess;
        int num_of_tries = 1;
        boolean win = false;

        while(win == false) {
            guess = input.nextInt();
            if (num_of_tries < 7) {
                if (guess == random_num) {
                    System.out.println("You guessed it right ,it was " + random_num);
                    System.out.println("It took you " + num_of_tries + " guessing rounds to guessed it correct!"+" "+
                            "Your score is" +" "+ num_of_tries);
                    input.close();
                    win = true;
                }
                else if (guess < random_num) {
                    System.out.println("You are guessing too low!");
                    System.out.println();
                    System.out.println("Guess again: ");
                }
                else if (guess > random_num) {
                    System.out.println("You are guessing too high!");
                    System.out.println();
                    System.out.println("Guess again: ");
                }
            }

            else if (num_of_tries == 7) {
                if(guess ==random_num)
                {
                    System.out.println();
                    System.out.println("You guessed it right ,it was " + random_num);
                    System.out.println("It took you " +num_of_tries + " guessing rounds to guessed it correct!");
                    System.out.println(  "Your score is"+" "+num_of_tries);
                    input.close();
                    win = true;

                }
                if (guess != random_num){
                    System.out.println();
                    System.out.println("Sorry you ran out of attempts.\nThe correct number is " +random_num+ "." +
                            "\nBetter luck next time");
                    input.close();
                    break;
                }
            }
            num_of_tries = num_of_tries+1;
        }
        System.out.println("--------Thankyou for playing this game----------");
    }
}


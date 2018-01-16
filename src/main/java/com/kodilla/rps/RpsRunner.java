package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public String playerOnePlays;

    public String computerPlays;

    public static int FirstPlayerResult;

    public static int ComputerResult;


    public static int n;


    public static void main(String[] args) {

        System.out.println("Please enter your name: ");


        System.out.println("Let's Play Rock Paper Scissors!\n" + "Please choose your option:\n" + "For Rock press 1" + "," + " for Paper press 2" + "," + " for Scissors press 3" + "," + " press x to abort game" + "," + " press n do restart game");

        System.out.println("Please set the winning streak: ");

        Random generator = new Random();


        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        System.out.println(n + " rounds will be played");

        for (int i = 0; i < 4; i++) {
            System.out.println("First player's turn");
            int firstChoice = sc.nextInt();

            System.out.println("Computer's turn");
            int secondChoice = generator.nextInt(3) + 1;
            System.out.println(secondChoice);

            // 1 = paper;
            // 2 = scissors;
            // 3 = stone;

            if (firstChoice == 1 && secondChoice == 2) {
                ComputerResult++;
            } else if (firstChoice == 2 && secondChoice == 3) {
                ComputerResult++;
            } else if (firstChoice == 1 && secondChoice == 3) {
                FirstPlayerResult++;
            } else if (firstChoice == 3 && secondChoice == 1) {
                ComputerResult++;
            } else if (firstChoice == 3 && secondChoice == 2) {
                FirstPlayerResult++;
            } else if (firstChoice == 2 && secondChoice == 1) {
                ComputerResult++;
            } else if (firstChoice == secondChoice) {
                i--;
            } else if (firstChoice > 4 || firstChoice < 0) {
                System.out.println("invalid move, try again");
            } else if (secondChoice > 4 || secondChoice < 0) ;
        }


        System.out.println("First player result is: " + FirstPlayerResult);
        System.out.println("                  ");
        System.out.println("Computer result is: " + ComputerResult);

        if (FirstPlayerResult > ComputerResult) {
            System.out.println("First player wins");

            if (FirstPlayerResult < ComputerResult) {
                System.out.println("Computer wins");
            } else if (FirstPlayerResult == ComputerResult) {
                System.out.println("It's a tie, one more round needed");

            }
        }
    }
}






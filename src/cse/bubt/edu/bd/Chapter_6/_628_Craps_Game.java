package cse.bubt.edu.bd.Chapter_6;

import java.util.Random;
import java.util.Scanner;
public class _628_Craps_Game {
        private static final Random randomNumbers = new Random();
        private static final int SNAKE_EYES = 2;
        private static final int TREY = 3;
        private static final int SEVEN = 7;
        private static final int YO_LEVEN = 11;
        private static final int BOX_CARS = 12;

        private enum Status { CONTINUE, WON, LOST }

        public static int rollDice() {
            int die1 = 1 + randomNumbers.nextInt(6);
            int die2 = 1 + randomNumbers.nextInt(6);
            int sum = die1 + die2;
            System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
            return sum;
        }

        public static void displayChatter() {
            String[] chatter = {
                    "Oh, you're going for broke, huh?",
                    "Aw c'mon, take a chance!",
                    "You're up big. Now's the time to cash in your chips!",
                    "Feeling lucky today?",
                    "Let's see if you can roll a winner!",
                    "This could be your big break!",
                    "Take a deep breath... and roll those dice!"
            };
            int index = randomNumbers.nextInt(chatter.length);
            System.out.println(chatter[index]);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int bankBalance = 1000;

            System.out.println("Welcome to Craps! Your starting balance is $1000.");

            while (bankBalance > 0) {
                int wager = 0;
                while (wager <= 0 || wager > bankBalance) {
                    System.out.printf("Your current balance is $%d. How much would you like to wager? ", bankBalance);
                    try {
                        wager = Integer.parseInt(scanner.nextLine());
                        if (wager <= 0 || wager > bankBalance) {
                            System.out.printf("Invalid wager. Your wager must be between $1 and $%d.\n", bankBalance);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                }

                displayChatter();

                Status gameStatus = Status.CONTINUE;
                int myPoint = 0;
                int sumOfDice = rollDice();

                switch (sumOfDice) {
                    case SEVEN:
                    case YO_LEVEN:
                        gameStatus = Status.WON;
                        break;
                    case SNAKE_EYES:
                    case TREY:
                    case BOX_CARS:
                        gameStatus = Status.LOST;
                        break;
                    default:
                        gameStatus = Status.CONTINUE;
                        myPoint = sumOfDice;
                        System.out.printf("Point is %d\n", myPoint);
                        break;
                }

                while (gameStatus == Status.CONTINUE) {
                    sumOfDice = rollDice();
                    if (sumOfDice == myPoint) {
                        gameStatus = Status.WON;
                    } else if (sumOfDice == SEVEN) {
                        gameStatus = Status.LOST;
                    }
                }

                if (gameStatus == Status.WON) {
                    System.out.println("Player wins!");
                    bankBalance += wager;
                } else {
                    System.out.println("Player loses.");
                    bankBalance -= wager;
                }

                if (bankBalance == 0) {
                    System.out.println("Sorry. You busted!");
                    break;
                }

                System.out.print("Do you want to play again? (y/n): ");
                String playAgain = scanner.nextLine().toLowerCase();
                if (!playAgain.equals("y")) {
                    System.out.println("Thanks for playing!");
                    break;
                }
            }
        }
    }


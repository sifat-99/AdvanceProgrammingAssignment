package cse.bubt.edu.bd.Chapter_6;

import java.util.Random;
import java.util.Scanner;
public class _624_CoinTossing {

        public enum Coin {
            HEADS, TAILS
        }

        public static Coin flip() {
            Random rand = new Random();
            return rand.nextBoolean() ? Coin.HEADS : Coin.TAILS;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int headsCount = 0;
            int tailsCount = 0;

            while (true) {

                System.out.println("Coin Tossing Program");
                System.out.println("1. Toss Coin");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    Coin result = flip();
                    if (result == Coin.HEADS) {
                        headsCount++;
                    } else {
                        tailsCount++;
                    }

                    System.out.println("Result of toss: " + result);
                    System.out.println("Heads: " + headsCount + " | Tails: " + tailsCount);
                } else if (choice == 2) {

                    System.out.println("Exiting the program. Final results:");
                    System.out.println("Heads: " + headsCount + " | Tails: " + tailsCount);
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

            scanner.close();
        }
    }


package cse.bubt.edu.bd.Chapter_6;

import java.util.Random;
import java.util.Scanner;
public class _626_Guess_Number_Modify {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            boolean playAgain = true;

            while (playAgain) {

                int targetNumber = random.nextInt(1000) + 1;
                int guess = 0;
                int attempts = 0;

                System.out.println("Guess a number between 1 and 1000.");

                while (guess != targetNumber) {
                    System.out.print("Enter your guess: ");
                    guess = scanner.nextInt();
                    attempts++;

                    if (guess < targetNumber) {
                        System.out.println("Too low. Try again.");
                    } else if (guess > targetNumber) {
                        System.out.println("Too high. Try again.");
                    }
                }

                System.out.println("Congratulations. You guessed the number in " + attempts + " attempts!");

                if (attempts <= 10) {
                    System.out.println("Either you know the secret or you got lucky!");
                } else if (attempts == 10) {
                    System.out.println("Aha! You know the secret!");
                } else {
                    System.out.println("You should be able to do better!");
                }

                System.out.print("Would you like to play again? (yes/no): ");
                String response = scanner.next();
                if (response.equalsIgnoreCase("no")) {
                    playAgain = false;
                }
            }
        }
    }



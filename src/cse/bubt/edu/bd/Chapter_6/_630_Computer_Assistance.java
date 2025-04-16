package cse.bubt.edu.bd.Chapter_6;

import java.util.Random;
import java.util.Scanner;
public class _630_Computer_Assistance {
        private static Random rand = new Random();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                // Generate and ask a multiplication question
                askMultiplicationQuestion();
            }
        }

        public static void askMultiplicationQuestion() {
            int num1 = rand.nextInt(9) + 1; // Generate a number between 1 and 9
            int num2 = rand.nextInt(9) + 1; // Generate another number between 1 and 9
            int correctAnswer = num1 * num2;

            System.out.printf("How much is %d times %d?\n", num1, num2);

            while (true) {
                int userAnswer = scanner.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Very good!");
                    break; // Exit the loop when the correct answer is given
                } else {
                    System.out.println("No. Please try again.");
                }
            }
        }
}

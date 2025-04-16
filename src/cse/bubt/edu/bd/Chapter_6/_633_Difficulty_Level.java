package cse.bubt.edu.bd.Chapter_6;

import java.util.Random;
import java.util.Scanner;

public class _633_Difficulty_Level {

        private static Random rand = new Random();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                System.out.println("Enter difficulty level (1: single digits, 2: two digits, 3: three digits): ");
                int difficulty = scanner.nextInt();

                for (int i = 0; i < 10; i++) {
                    int num1 = generateNumber(difficulty);
                    int num2 = generateNumber(difficulty);
                    int correctAnswer = num1 * num2;

                    System.out.printf("How much is %d times %d?\n", num1, num2);

                    while (true) {
                        int userAnswer = scanner.nextInt();

                        if (userAnswer == correctAnswer) {
                            provideResponse(true);
                            break;
                        } else {
                            provideResponse(false);
                        }
                    }
                }
            }
        }

        public static int generateNumber(int difficulty) {
            return rand.nextInt((int) Math.pow(10, difficulty));
        }

        public static void provideResponse(boolean correct) {
            String[] correctResponses = {
                    "Very good!", "Excellent!", "Nice work!", "Keep up the good work!"
            };
            String[] incorrectResponses = {
                    "No. Please try again.", "Wrong. Try once more.", "Don't give up!", "No. Keep trying."
            };

            String response = "";
            if (correct) {
                response = correctResponses[rand.nextInt(correctResponses.length)];
            } else {
                response = incorrectResponses[rand.nextInt(incorrectResponses.length)];
            }

            System.out.println(response);
        }
    }


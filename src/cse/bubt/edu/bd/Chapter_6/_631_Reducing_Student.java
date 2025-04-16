package cse.bubt.edu.bd.Chapter_6;

import java.util.Random;
import java.util.Scanner;
public class _631_Reducing_Student {
        private static Random rand = new Random();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                askMultiplicationQuestion();
            }
        }

        public static void askMultiplicationQuestion() {
            int num1 = rand.nextInt(9) + 1;
            int num2 = rand.nextInt(9) + 1;
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


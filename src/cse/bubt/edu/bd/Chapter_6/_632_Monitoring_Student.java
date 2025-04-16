package cse.bubt.edu.bd.Chapter_6;

import java.util.Random;
import java.util.Scanner;
public class _632_Monitoring_Student {

        private static Random rand = new Random();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                int correctAnswers = 0;
                int incorrectAnswers = 0;

                for (int i = 0; i < 10; i++) {
                    int num1 = rand.nextInt(9) + 1;
                    int num2 = rand.nextInt(9) + 1;
                    int correctAnswer = num1 * num2;

                    System.out.printf("How much is %d times %d?\n", num1, num2);

                    while (true) {
                        int userAnswer = scanner.nextInt();

                        if (userAnswer == correctAnswer) {
                            correctAnswers++;
                            provideResponse(true);
                            break;
                        } else {
                            incorrectAnswers++;
                            provideResponse(false);
                        }
                    }
                }

                double percentage = (double) correctAnswers / 10 * 100;
                System.out.println("Your performance: " + percentage + "% correct");
                if (percentage >= 75) {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                } else {
                    System.out.println("Please ask your teacher for extra help.");
                }
                System.out.println("Next student, please.");
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


package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;
public class _611_Multiple {


        public static boolean isMultiple(int num1, int num2) {
            return num2 % num1 == 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1, num2;

            while (true) {
                System.out.print("Enter the first integer (or 0 to exit): ");
                num1 = scanner.nextInt();

                if (num1 == 0) {
                    break;
                }

                System.out.print("Enter the second integer: ");
                num2 = scanner.nextInt();

                if (isMultiple(num1, num2)) {
                    System.out.println(num2 + " is a multiple of " + num1);
                } else {
                    System.out.println(num2 + " is NOT a multiple of " + num1);
                }
            }
        }
    }

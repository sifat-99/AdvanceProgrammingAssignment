package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;
public class _616_Separating_Digit {

        public static int integerQuotient(int a, int b) {
            return a / b;
        }

        public static int integerRemainder(int a, int b) {
            return a % b;
        }

        public static void displayDigits(int number) {
            String numberStr = Integer.toString(number);
            for (int i = 0; i < numberStr.length(); i++) {
                System.out.print(numberStr.charAt(i));
                if (i != numberStr.length() - 1) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer between 1 and 99999: ");
            int number = scanner.nextInt();


                System.out.print("The digits of the number are: ");
                displayDigits(number);

            System.out.print("Enter two integers for division (a and b): ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int quotient = integerQuotient(a, b);
            int remainder = integerRemainder(a, b);

            System.out.println("Quotient of " + a + " / " + b + " is: " + quotient);
            System.out.println("Remainder of " + a + " % " + b + " is: " + remainder);
        }
    }


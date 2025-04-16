package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;
public class _609_Exponentiation {


        public static int integerPower(int base, int exponent) {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter base: ");
            int base = scanner.nextInt();

            System.out.print("Enter exponent: ");
            int exponent = scanner.nextInt();

            int result = integerPower(base, exponent);

            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }
    }


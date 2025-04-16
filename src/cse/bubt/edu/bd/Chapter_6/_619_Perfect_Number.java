package cse.bubt.edu.bd.Chapter_6;

public class _619_Perfect_Number {
        public static boolean isPerfect(int number) {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return sum == number;
        }

        public static void main(String[] args) {
            System.out.println("Perfect numbers between 1 and 1000:");
            for (int num = 1; num <= 1000; num++) {
                if (isPerfect(num)) {
                    System.out.print(num + " ");
                }
            }
        }
    }


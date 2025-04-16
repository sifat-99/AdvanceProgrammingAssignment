package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;

public class _610_Hypotenuse_Calculator {
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side2: ");
        double side2 = scanner.nextDouble();

        double hypotenuseLength = hypotenuse(side1, side2);

        System.out.println("The length of the hypotenuse is: " + hypotenuseLength);
    }
}

package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;
public class _627_Distance_Calculator {
        public static double distance(double x1, double y1, double x2, double y2) {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the x-coordinate of the first point: ");
            double x1 = scanner.nextDouble();
            System.out.print("Enter the y-coordinate of the first point: ");
            double y1 = scanner.nextDouble();

            System.out.print("Enter the x-coordinate of the second point: ");
            double x2 = scanner.nextDouble();
            System.out.print("Enter the y-coordinate of the second point: ");
            double y2 = scanner.nextDouble();

            double dist = distance(x1, y1, x2, y2);

            System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + dist);
        }
    }


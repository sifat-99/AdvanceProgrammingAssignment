package cse.bubt.edu.bd.Chapter_8.Rational;

public class Main {
    // Main method to test Rational class
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 4);
        Rational r2 = new Rational(3, 5);

        System.out.println("First Rational Number: " + r1);
        System.out.println("Second Rational Number: " + r2);

        System.out.println("Addition: " + Rational.add(r1, r2));
        System.out.println("Subtraction: " + Rational.subtract(r1, r2));
        System.out.println("Multiplication: " + Rational.multiply(r1, r2));
        System.out.println("Division: " + Rational.divide(r1, r2));
        System.out.println("Float Representation (2 decimals): " + r1.toFloatString(2));
    }
}

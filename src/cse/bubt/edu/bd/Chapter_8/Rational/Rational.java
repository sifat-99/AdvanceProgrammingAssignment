package cse.bubt.edu.bd.Chapter_8.Rational;
public class Rational {
    private int numerator;
    private int denominator;

    // Default constructor (0/1)
    public Rational() {
        this(0, 1);
    }

    // Parameterized constructor with reduction
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
        if (this.denominator < 0) { // Ensure denominator is positive
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    // Greatest Common Divisor (GCD)
    private static int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    // Addition
    public static Rational add(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Subtraction
    public static Rational subtract(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Multiplication
    public static Rational multiply(Rational r1, Rational r2) {
        return new Rational(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
    }

    // Division
    public static Rational divide(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return new Rational(r1.numerator * r2.denominator, r1.denominator * r2.numerator);
    }

    // String representation in a/b format
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Floating-point representation
    public String toFloatString(int precision) {
        return String.format("%.", precision + "f", (double) numerator / denominator);
    }

}

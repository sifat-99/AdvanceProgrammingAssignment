package cse.bubt.edu.bd.Chapter_8.ComplexNumber;

public class Complex {
    private double real;
    private double imaginary;

    // No-argument constructor (default values: 0.0 + 0.0i)
    public Complex() {
        this(0.0, 0.0);
    }

    // Parameterized constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two Complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to subtract two Complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Method to display a Complex number
    public void print() {
        System.out.printf("(%.2f, %.2f)%n", real, imaginary);
    }

    // Main method to test the Complex class
}

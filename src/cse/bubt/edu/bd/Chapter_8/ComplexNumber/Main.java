package cse.bubt.edu.bd.Chapter_8.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        Complex num1 = new Complex(3.5, 2.5);
        Complex num2 = new Complex(1.2, 4.1);

        System.out.print("First Complex Number: ");
        num1.print();

        System.out.print("Second Complex Number: ");
        num2.print();

        // Addition
        Complex sum = num1.add(num2);
        System.out.print("Sum: ");
        sum.print();

        // Subtraction
        Complex difference = num1.subtract(num2);
        System.out.print("Difference: ");
        difference.print();
    }
}

package cse.bubt.edu.bd.Chapter_9.Shape6;

public class Triangle extends TwoDimensionalShape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}
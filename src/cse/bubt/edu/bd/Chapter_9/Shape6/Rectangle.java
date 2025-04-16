package cse.bubt.edu.bd.Chapter_9.Shape6;

public class Rectangle extends Quadrilateral {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
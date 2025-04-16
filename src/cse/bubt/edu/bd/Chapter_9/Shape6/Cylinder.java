package cse.bubt.edu.bd.Chapter_9.Shape6;
public class Cylinder extends ThreeDimensionalShape {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
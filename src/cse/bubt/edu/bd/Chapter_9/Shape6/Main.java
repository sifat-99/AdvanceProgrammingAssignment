package cse.bubt.edu.bd.Chapter_9.Shape6;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(4, 3),
                new Rectangle(6, 2),
                new Cube(4),
                new Cylinder(3, 7)
        };

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof ThreeDimensionalShape) {
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
        }
    }
}

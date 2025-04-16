package cse.bubt.edu.bd.Chapter_8.Rectangle4;
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Default length: " + rect.getLength());
        System.out.println("Default width: " + rect.getWidth());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("Area: " + rect.calculateArea());

        rect.setLength(5.5);
        rect.setWidth(10.0);
        System.out.println("\nAfter valid sets:");
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("Area: " + rect.calculateArea());

        rect.setLength(-1);
        rect.setWidth(30);
        System.out.println("\nAfter invalid sets:");
        System.out.println("Length remains: " + rect.getLength());
        System.out.println("Width remains: " + rect.getWidth());
    }
}

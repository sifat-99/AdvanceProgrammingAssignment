package cse.bubt.edu.bd.Chapter_9.Shape6;
public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getArea() {
        return 6 * side * side;
    }

    public double getVolume() {
        return Math.pow(side, 3);
    }
}




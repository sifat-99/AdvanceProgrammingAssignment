package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;
public class _615_Circle {
    public static double circleArea(double radius)
    {
      return 3.1416*radius*radius;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double radius=scanner.nextFloat();
        System.out.println("The Area Of the Circle: "+circleArea(radius));
    }
}

package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;

public class _617_Temperature_Conversions {
    public static double celsius(double fahrenheit)
    {
       return 5.0/9.0*(fahrenheit-32);
    }
    public static double fahrenheit(double celsius)
    {
        return 9.0/5.0*(celsius+32);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Celsius : ");
        double d=scanner.nextDouble();
        System.out.println("Equivalence of Celsius-The Fahrenheit Temp is : "+fahrenheit(d));
        System.out.print("Enter Fahrenheit : ");
        double d1=scanner.nextDouble();

        System.out.println("Equivalence of Celsius-The Fahrenheit Temp is : "+celsius(d1));

    }
}

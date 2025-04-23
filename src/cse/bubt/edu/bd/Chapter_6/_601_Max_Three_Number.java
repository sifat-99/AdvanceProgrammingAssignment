package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;

public class _601_Max_Three_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c;
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        double d = greater(a,b,c);
        System.out.println(d);
    }
    public static double greater(double a, double b, double c) {

        if(a>b && a>c){
            return a;
        }
        else if (b>a && b>c) {
            return b;
        }
        else return c;
    }
    }


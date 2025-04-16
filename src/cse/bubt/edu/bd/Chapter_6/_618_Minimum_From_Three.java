package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;

public class _618_Minimum_From_Three {
    public static void minimum3(float a,float b,float c)
    {
       float f=Math.min(a,b);
       float g=Math.min(f,c);
        System.out.println("The Minimum Number From The Three Numbers is : "+g);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Three Floating Numbers : ");
        float n1=scanner.nextFloat();
        float n2=scanner.nextFloat();
        float n3=scanner.nextFloat();
        minimum3(n1,n2,n3);
    }
}

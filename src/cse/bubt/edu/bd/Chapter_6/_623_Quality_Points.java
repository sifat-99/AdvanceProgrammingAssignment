package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;

public class _623_Quality_Points {
    public static int qualityPoints(int a)
    {
        if(a>=90 && a<=100)
        {
            return 4;
        }
        else if(a>=80 && a<=89)
        {
            return 3;
        }
        else if (a>=70 && a<=79)
        {
            return 2;
        }
        else if(a>=60 && a<=69)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter An Integer : ");
        int num=scanner.nextInt();
        System.out.println("Point : "+qualityPoints(num));
    }
}

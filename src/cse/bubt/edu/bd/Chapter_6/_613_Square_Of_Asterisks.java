package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;

public class _613_Square_Of_Asterisks {
    public static void squareOfAsterisks(int a)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int b=scanner.nextInt();
        squareOfAsterisks(b);
    }
}

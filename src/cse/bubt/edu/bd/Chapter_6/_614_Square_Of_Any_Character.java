package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;

public class _614_Square_Of_Any_Character {
    public static void squareOfAnyChar(int a,char b)
    {
        for (int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(""+b);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A Number With A Character : ");
        int a=scanner.nextInt();
        char b=scanner.next().charAt(0);

        squareOfAnyChar(a,b);
    }
}

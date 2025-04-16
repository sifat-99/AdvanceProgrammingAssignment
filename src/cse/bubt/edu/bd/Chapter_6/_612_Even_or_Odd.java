package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;

public class _612_Even_or_Odd {

    public static boolean isEven(int a){
        return a%2==0;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter A Number( or 0 to Exit ) : ");
            int b=scanner.nextInt();
            if (b==0)
            {
                break;
            }
            if(isEven(b))
            {
                System.out.println(b+" is an Even Number .");
            }
            else{
                System.out.println(b+" is an Odd Number .");
            }
        }

    }
}

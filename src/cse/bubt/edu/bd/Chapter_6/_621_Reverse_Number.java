package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;

public class _621_Reverse_Number {
    public static int reverse(int number)
    {
        int reversed=0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number=scanner.nextInt();
        System.out.print("The Reverse Of The Number : "+reverse(number));

    }
}

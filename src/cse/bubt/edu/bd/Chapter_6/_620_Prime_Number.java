package cse.bubt.edu.bd.Chapter_6;

public class _620_Prime_Number {
    public static boolean isPrime(int prime)
    {
        int count =0;
        for(int i= 2;i<prime/2;i++)
        {
            if(prime%i==0)
            {
                count++;
            }
        }
        return count==0;
    }

    public static void main(String[] args) {
        System.out.print("Prime Numbers Under 10000 are :");
        for(int i=2;i<10000;i++)
        {
            if(isPrime(i))
            {
                System.out.print(" "+i);
            }
        }
    }
}

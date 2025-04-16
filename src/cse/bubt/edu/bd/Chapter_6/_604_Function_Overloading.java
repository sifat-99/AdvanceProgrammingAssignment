package cse.bubt.edu.bd.Chapter_6;

public class _604_Function_Overloading {
    public static void main(String[] args) {
        int a=square(7);
        double b=square(7.5);
        System.out.printf("Square Of Integer 7 is: %d\n",a);
        System.out.printf("Square Of double 7.5 is: %f\n", b );
    }
    public static int square(int v)
    {
        return v*v;
    }

    public static double square(double v) {
        return v*v;
    }
}

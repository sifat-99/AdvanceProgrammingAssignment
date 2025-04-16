package cse.bubt.edu.bd.Chapter_6;

import java.util.Scanner;

public class _606_Parking_Charge {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        float totalreciepts=0;
        while(true) {
            float b=a.nextFloat();
            float f=calculateCharge((int)b);
            totalreciepts=f+totalreciepts;
            System.out.printf("The Charges For Parking %f Hours is %f\n",b,f);
            System.out.printf("The total charge Gained for the day is: %f\n",totalreciepts);
        }
    }
    public static  float calculateCharge(int b)
    {

        if (b<=3)
        {
            return 3;

        }
        else if(b==24)
        {

            return 10;

        }
        else{

            float c=b-3;

            return (float) ((c*0.5)+2);
        }

    }
}

package cse.bubt.edu.bd.Chapter_6;

import java.util.Random;

public class _602_Random_Number {
    public static void main(String[] args) {
        Random randomNumber=new Random();
        int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
        int face;
        for (int i=0;i<6000000;i++)
        {
            face=1+ randomNumber.nextInt(6);
            switch(face) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    break;
            }
        }
        System.out.println("Face\t");
        System.out.printf(" 1\t %d\n 2\t %d\n 3\t %d\n 4\t %d\n 5\t %d\n 6\t %d\n",c1,c2,c3,c4,c5,c6);
    }
    }

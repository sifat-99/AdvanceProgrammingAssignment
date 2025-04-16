package cse.bubt.edu.bd.Chapter_6;

public class _629_Binary_Octal_Hexadecimal {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Decimal", "Binary", "Octal", "Hexadecimal");
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%-10d%-10s%-10s%-10s\n", i, Integer.toBinaryString(i), Integer.toOctalString(i), Integer.toHexString(i).toUpperCase());
        }
    }
}

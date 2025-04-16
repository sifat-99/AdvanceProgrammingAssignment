package cse.bubt.edu.bd.Chapter_8.Date;

public class Main {
    public static void main(String[] args) {
        // Test incrementing into the next month
        Date date1 = new Date(1, 31, 2024);
        System.out.println("Before nextDay: " + date1);
        date1.nextDay();
        System.out.println("After nextDay (next month): " + date1);

        // Test incrementing into the next year
        Date date2 = new Date(12, 31, 2024);
        System.out.println("Before nextDay (end of year): " + date2);
        date2.nextDay();
        System.out.println("After nextDay (next year): " + date2);
    }
}

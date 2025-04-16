package cse.bubt.edu.bd.Chapter_8.DateAndTime;
public class Main {
    public static void main(String[] args) {
        DateAndTime dateTime = new DateAndTime(12, 31, 2024, 23, 59, 59);
        System.out.println("Before incrementing:");
        System.out.println(dateTime);

        // Increment second to roll over to next day
        dateTime.incrementSecond();

        System.out.println("After incrementing (Next day):");
        System.out.println(dateTime);
    }
}

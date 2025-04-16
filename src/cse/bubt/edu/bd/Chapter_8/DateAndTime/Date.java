package cse.bubt.edu.bd.Chapter_8.DateAndTime;
public class Date {
    private int day;
    private int month;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year) {
        if (month < 1 || month > 12)
            throw new IllegalArgumentException("Month must be 1-12");

        if (day < 1 || day > daysInMonth(month, year))
            throw new IllegalArgumentException("Invalid day for the given month and year");

        if (year < 1)
            throw new IllegalArgumentException("Year must be positive");

        this.month = month;
        this.day = day;
        this.year = year;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int daysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysPerMonth[month];
    }

    public void nextDay() {
        if (day < daysInMonth(month, year)) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

}
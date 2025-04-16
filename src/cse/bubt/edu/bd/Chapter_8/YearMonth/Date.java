package cse.bubt.edu.bd.Chapter_8.YearMonth;

import java.util.Calendar;
public class Date {
    private int month;
    private int day;
    private int year;
    private static final String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Constructor for MM/DD/YYYY format
    public Date(int month, int day, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month. Must be 1-12.");
        }
        if (day < 1 || day > daysInMonth(month, year)) {
            throw new IllegalArgumentException("Invalid day for the given month and year.");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Constructor for Month DD, YYYY format
    public Date(String monthName, int day, int year) {
        int month = getMonthFromName(monthName);
        if (month == -1) {
            throw new IllegalArgumentException("Invalid month name.");
        }
        if (day < 1 || day > daysInMonth(month, year)) {
            throw new IllegalArgumentException("Invalid day for the given month and year.");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Constructor for DDD YYYY format (Day of Year)
    public Date(int dayOfYear, int year) {
        if (dayOfYear < 1 || dayOfYear > (isLeapYear(year) ? 366 : 365)) {
            throw new IllegalArgumentException("Invalid day of the year.");
        }
        this.year = year;
        setDateFromDayOfYear(dayOfYear, year);
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

    private int getMonthFromName(String monthName) {
        for (int i = 1; i < monthNames.length; i++) {
            if (monthNames[i].equalsIgnoreCase(monthName)) {
                return i;
            }
        }
        return -1;
    }

    private void setDateFromDayOfYear(int dayOfYear, int year) {
        int month = 1;
        while (dayOfYear > daysInMonth(month, year)) {
            dayOfYear -= daysInMonth(month, year);
            month++;
        }
        this.month = month;
        this.day = dayOfYear;
    }

    public String toMMDDYYYY() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    public String toMonthDDYYYY() {
        return String.format("%s %d, %d", monthNames[month], day, year);
    }

    public String toDDDYYYY() {
        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth(i, year);
        }
        return String.format("%03d %04d", dayOfYear, year);
    }

}


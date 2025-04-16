package cse.bubt.edu.bd.Chapter_8.DateAndTime;
public class Time2 {
    private int hour;
    private int minute;
    private int second;

    public Time2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("Second must be between 0 and 59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void incrementHour(Date date) {
        if (hour == 23) {
            hour = 0;
            date.nextDay();
        } else {
            hour++;
        }
    }

    public void incrementMinute(Date date) {
        if (minute == 59) {
            minute = 0;
            incrementHour(date);
        } else {
            minute++;
        }
    }

    public void incrementSecond(Date date) {
        if (second == 59) {
            second = 0;
            incrementMinute(date);
        } else {
            second++;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
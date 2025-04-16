package cse.bubt.edu.bd.Chapter_8.DateAndTime;
public class DateAndTime {
    private Date date;
    private Time2 time;

    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
        this.date = new Date(month, day, year);
        this.time = new Time2(hour, minute, second);
    }

    public void incrementSecond() {
        time.incrementSecond(date);
    }

    public void incrementMinute() {
        time.incrementMinute(date);
    }

    public void incrementHour() {
        time.incrementHour(date);
    }

    public String toString() {
        return date.toString() + " " + time.toString();
    }

}

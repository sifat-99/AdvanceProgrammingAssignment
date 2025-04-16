package cse.bubt.edu.bd.Chapter_8.Time2;
public class Time2 {
    private int totalSeconds; // seconds since midnight

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int h) {
        this(h, 0, 0);
    }

    public Time2(int h, int m) {
        this(h, m, 0);
    }

    public Time2(int h, int m, int s) {
        setTime(h, m, s);
    }

    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        if (h < 0 || h >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        totalSeconds = h * 3600 + getMinute() * 60 + getSecond();
    }

    public void setMinute(int m) {
        if (m < 0 || m >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        totalSeconds = getHour() * 3600 + m * 60 + getSecond();
    }

    public void setSecond(int s) {
        if (s < 0 || s >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        totalSeconds = getHour() * 3600 + getMinute() * 60 + s;
    }

    public int getHour() {
        return totalSeconds / 3600;
    }

    public int getMinute() {
        return (totalSeconds % 3600) / 60;
    }

    public int getSecond() {
        return totalSeconds % 60;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        int hour = getHour();
        String period = hour < 12 ? "AM" : "PM";
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        return String.format("%d:%02d:%02d %s", standardHour, getMinute(), getSecond(), period);
    }
}

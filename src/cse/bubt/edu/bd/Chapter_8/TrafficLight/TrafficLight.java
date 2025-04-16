package cse.bubt.edu.bd.Chapter_8.TrafficLight;
public enum TrafficLight {
    RED(30), GREEN(60), YELLOW(5);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

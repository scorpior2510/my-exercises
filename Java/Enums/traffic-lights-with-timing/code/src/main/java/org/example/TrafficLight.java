package org.example;

public enum TrafficLight {

    RED(60),
    YELLOW(5),
    GREEN(30);

    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public TrafficLight getNextLight() {
        return TrafficLight.values()[(this.ordinal() + 2) % 3];
    }
}

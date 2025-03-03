package org.example;

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRURSDAY, FRIDAY, SATURDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public String activity() {
        return isWeekend() ? "Relax" : "Work";
    }
}

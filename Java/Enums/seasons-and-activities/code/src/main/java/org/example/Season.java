package org.example;

public enum Season {

    SPRING("Take a walk", "Eat Ice Cream", "Take a Cold Bath"),
    SUMMER("Watch Sunrise", "Get a tan", "watch tv"),
    AUTUMN("drink tee", "Take a walk", "Take a hot Bath"),
    WINTER("drink coffee", "Eat soup", "watch winter games");

    private String morningActivity;
    private String afternoonActivity;
    private String eveningActivity;

    enum TimeOfDay {
        MORNING, AFTERNOON, EVENING
    }

    Season(String morningActivity, String afternoonActivity, String eveningActivity) {
        this.morningActivity = morningActivity;
        this.afternoonActivity = afternoonActivity;
        this.eveningActivity = eveningActivity;

    }

    public String activity(TimeOfDay timeOfDay) {
        String activity = null;
        switch (timeOfDay) {
            case MORNING:
                activity = this.morningActivity;
                break;
            case AFTERNOON:
                activity = this.afternoonActivity;
                break;
            case EVENING:
                activity = this.eveningActivity;
                break;
            default:
                activity = "something went wrong";
                break;
        }
        return activity;
    }
}

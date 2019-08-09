package com.hacksquad.sprintanalytics.dto;

public class SprintPriorityDTO {

    private String sprintName;
    private int lowest;
    private int high;
    private int low;
    private int highest;
    private int medium;

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public int getLowest() {
        return lowest;
    }

    public void setLowest(int lowest) {
        this.lowest = lowest;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHighest() {
        return highest;
    }

    public void setHighest(int highest) {
        this.highest = highest;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        return "SprintPriorityDTO{" +
                "sprintName='" + sprintName + '\'' +
                ", lowest=" + lowest +
                ", high=" + high +
                ", low=" + low +
                ", highest=" + highest +
                ", medium=" + medium +
                '}';
    }
}

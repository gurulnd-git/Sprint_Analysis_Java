package com.hacksquad.sprintanalytics.dto;

public class VelocityTrendDTO {
    private String name;
    private float value;
    private int committedStory;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getCommittedStory() {
        return committedStory;
    }

    public void setCommittedStory(int committedStory) {
        this.committedStory = committedStory;
    }

    public VelocityTrendDTO(String name, float value, int committedStory) {
        this.name = name;
        this.value = value;
        this.committedStory = committedStory;
    }
}

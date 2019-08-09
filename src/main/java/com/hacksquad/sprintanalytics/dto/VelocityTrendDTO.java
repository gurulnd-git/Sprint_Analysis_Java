package com.hacksquad.sprintanalytics.dto;

public class VelocityTrendDTO {
    private String sprintName;
    private float velocity;
    private int committedStory;


    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public int getCommittedStory() {
        return committedStory;
    }

    public void setCommittedStory(int committedStory) {
        this.committedStory = committedStory;
    }

    public VelocityTrendDTO(String sprintName, float velocity, int committedStory) {
        this.sprintName = sprintName;
        this.velocity = velocity;
        this.committedStory = committedStory;
    }
}

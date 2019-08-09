package com.hacksquad.sprintanalytics.dto;

public class ScopeChangeDTO {

    private String sprintName;
    private Integer addedScope;
    private Integer commitedScope;
    private Integer removedScope;

    public ScopeChangeDTO(String sprintName, Integer addedScope, Integer commitedScope, Integer removedScope) {
        this.sprintName = sprintName;
        this.addedScope = addedScope;
        this.commitedScope = commitedScope;
        this.removedScope = removedScope;
    }


    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public Integer getAddedScope() {
        return addedScope;
    }

    public void setAddedScope(Integer addedScope) {
        this.addedScope = addedScope;
    }

    public Integer getCommitedScope() {
        return commitedScope;
    }

    public void setCommitedScope(Integer commitedScope) {
        this.commitedScope = commitedScope;
    }

    public Integer getRemovedScope() {
        return removedScope;
    }

    public void setRemovedScope(Integer removedScope) {
        this.removedScope = removedScope;
    }
}

package com.hacksquad.sprintanalytics.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="prioritydetails")
public class PriorityDetails implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "sprint_id", nullable = false)
    private Sprint Sprint;


    @Column(name = "issue_type")
    private String issueType;

    @Column(name = "priority")
    private String priority;

    @Column(name = "priority_count")
    private int priorityCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.hacksquad.sprintanalytics.entity.Sprint getSprint() {
        return Sprint;
    }

    public void setSprint(com.hacksquad.sprintanalytics.entity.Sprint sprint) {
        Sprint = sprint;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public int getPriorityCount() {
        return priorityCount;
    }

    public void setPriorityCount(int priorityCount) {
        this.priorityCount = priorityCount;
    }

    @Override
    public String toString() {
        return "PriorityDetails{" +
                "id=" + id +
                ", Sprint=" + Sprint +
                ", issueType='" + issueType + '\'' +
                ", priority='" + priority + '\'' +
                ", priorityCount=" + priorityCount +
                '}';
    }
}


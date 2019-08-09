package com.hacksquad.sprintanalytics.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="sprint")
public class Sprint implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="start")
    private Date startDate;
    @Column(name="end")
    private Date endDate;
    @Column(name="closed")
    private Boolean closed;
    @Column(name="project_name")
    private  String projectName;
//    @OneToMany(fetch = FetchType.EAGER)
//    private List<PriorityDetails> priorityList;


//    public List<PriorityDetails> getPriorityList() {
//        return priorityList;
//    }
//
//    public void setPriorityList(List<PriorityDetails> priorityList) {
//        this.priorityList = priorityList;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Sprint{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", closed=" + closed +
                ", projectName='" + projectName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sprint)) return false;
        Sprint sprint = (Sprint) o;
        return getId() == sprint.getId() &&
                Objects.equals(getName(), sprint.getName()) &&
                Objects.equals(getStartDate(), sprint.getStartDate()) &&
                Objects.equals(getEndDate(), sprint.getEndDate()) &&
                Objects.equals(getClosed(), sprint.getClosed()) &&
                Objects.equals(getProjectName(), sprint.getProjectName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getStartDate(), getEndDate(), getClosed(), getProjectName());
    }
}

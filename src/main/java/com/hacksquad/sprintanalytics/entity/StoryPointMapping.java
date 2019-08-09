package com.hacksquad.sprintanalytics.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="storypointmapping")
public class StoryPointMapping implements Serializable {

 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 @Column(name="id")
 private Integer id;
 @OneToOne
 @JoinColumn(name = "sprint_id", nullable = false)
 private Sprint Sprint;
 @Column(name="committed_sp")
 private  Integer commitedStoryPoint;
 @Column(name="accepted_sp")
 private Integer acceptedStoryPoint;


 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public com.hacksquad.sprintanalytics.entity.Sprint getSprint() {
  return Sprint;
 }

 public void setSprint(com.hacksquad.sprintanalytics.entity.Sprint sprint) {
  Sprint = sprint;
 }

 public Integer getCommitedStoryPoint() {
  return commitedStoryPoint;
 }

 public void setCommitedStoryPoint(Integer commitedStoryPoint) {
  this.commitedStoryPoint = commitedStoryPoint;
 }

 public Integer getAcceptedStoryPoint() {
  return acceptedStoryPoint;
 }

 public void setAcceptedStoryPoint(Integer acceptedStoryPoint) {
  this.acceptedStoryPoint = acceptedStoryPoint;
 }


 @Override
 public String toString() {
  return "StoryPointMapping{" +
          "id=" + id +
          ", Sprint=" + Sprint +
          ", commitedStoryPoint=" + commitedStoryPoint +
          ", acceptedStoryPoint=" + acceptedStoryPoint +
          '}';
 }
}

package com.hacksquad.sprintanalytics.Repo;


import com.hacksquad.sprintanalytics.entity.Sprint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintRepo extends CrudRepository<Sprint,Long> {

}

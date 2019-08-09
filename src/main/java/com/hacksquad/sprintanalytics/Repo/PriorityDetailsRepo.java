package com.hacksquad.sprintanalytics.Repo;

import com.hacksquad.sprintanalytics.entity.PriorityDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityDetailsRepo  extends CrudRepository<PriorityDetails,Long> {
}


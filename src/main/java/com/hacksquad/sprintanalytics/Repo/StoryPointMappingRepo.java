package com.hacksquad.sprintanalytics.Repo;

import com.hacksquad.sprintanalytics.entity.StoryPointMapping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryPointMappingRepo extends CrudRepository<StoryPointMapping,Long> {
}

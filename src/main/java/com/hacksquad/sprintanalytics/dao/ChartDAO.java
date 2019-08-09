package com.hacksquad.sprintanalytics.dao;

import com.hacksquad.sprintanalytics.entity.PriorityDetails;
import com.hacksquad.sprintanalytics.entity.Sprint;
import com.hacksquad.sprintanalytics.entity.StoryPointMapping;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ChartDAO {


    @PersistenceContext
    private EntityManager entityManager;

    public List<StoryPointMapping> getStoryPointMapping() {
        List<StoryPointMapping> storyPointMappings = null;

        storyPointMappings = entityManager.createQuery("from StoryPointMapping ", StoryPointMapping.class).getResultList();
        return storyPointMappings;
    }

    public List<PriorityDetails> getPriorityDetails() {

//        List<PriorityDetails> priorityDetailsList = null;
        List<Sprint> priorityDetailsList = null;
        priorityDetailsList = entityManager.createQuery("from Sprint ", Sprint.class).getResultList();
        System.out.println(priorityDetailsList);
        return null;
    }

}







package com.hacksquad.sprintanalytics.component;

import com.hacksquad.sprintanalytics.Repo.PriorityDetailsRepo;
import com.hacksquad.sprintanalytics.dao.ChartDAO;
import com.hacksquad.sprintanalytics.dto.ScopeChangeDTO;
import com.hacksquad.sprintanalytics.dto.SprintPriorityDTO;
import com.hacksquad.sprintanalytics.dto.VelocityTrendDTO;
import com.hacksquad.sprintanalytics.entity.PriorityDetails;
import com.hacksquad.sprintanalytics.entity.Sprint;
import com.hacksquad.sprintanalytics.entity.StoryPointMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class VelocityChartComponent {

    @Autowired
    private ChartDAO chartDAO;

    @Autowired
    private PriorityDetailsRepo priorityDetailsRepo;

    public List<VelocityTrendDTO> calculateVelocityTrend() {
        List<StoryPointMapping> storyPointMappings = chartDAO.getStoryPointMapping();

        List<VelocityTrendDTO> velocityTrends = new ArrayList<>();
        for (StoryPointMapping storyPointMapping : storyPointMappings
        ) {
            int count = storyPointMapping.getAcceptedStoryPoint() - storyPointMapping.getCommitedStoryPoint();
            float velocity = 0;
            if (count != 0 && storyPointMapping.getCommitedStoryPoint() != 0) {
                velocity = (((float)count / (float)storyPointMapping.getCommitedStoryPoint())) * 100;
                velocityTrends.add(new VelocityTrendDTO(storyPointMapping.getSprint().getName(), velocity,storyPointMapping.getAcceptedStoryPoint()));
            } else {
                velocityTrends.add(new VelocityTrendDTO(storyPointMapping.getSprint().getName(), (float) 0,storyPointMapping.getAcceptedStoryPoint()));
            }


        }
        return velocityTrends;

    }


    public List<VelocityTrendDTO> calculateSuccessRate() {
        List<StoryPointMapping> storyPointMappings = chartDAO.getStoryPointMapping();

        List<VelocityTrendDTO> velocityTrends = new ArrayList<>();
        for (StoryPointMapping storyPointMapping : storyPointMappings
        ) {

            if (storyPointMapping.getAcceptedStoryPoint() != 0 && storyPointMapping.getCommitedStoryPoint() != 0) {
                velocityTrends.add(new VelocityTrendDTO(storyPointMapping.getSprint().getName(),  ((float)storyPointMapping.getAcceptedStoryPoint() /(float)storyPointMapping.getCommitedStoryPoint()) * 100,storyPointMapping.getAcceptedStoryPoint()));
            } else {
                System.out.println(storyPointMapping.getSprint().getProjectName());
                velocityTrends.add(new VelocityTrendDTO(storyPointMapping.getSprint().getName(), (float) 0,storyPointMapping.getAcceptedStoryPoint()));
            }


        }
        return velocityTrends;

    }


    public List<ScopeChangeDTO> calculateScopeChange() {
        List<StoryPointMapping> storyPointMappings = chartDAO.getStoryPointMapping();

        List<ScopeChangeDTO> scopeChanges = new ArrayList<>();
        for (StoryPointMapping storyPointMapping : storyPointMappings
        ) {


            if (storyPointMapping.getAcceptedStoryPoint() > storyPointMapping.getCommitedStoryPoint()) {
                scopeChanges.add(new ScopeChangeDTO(storyPointMapping.getSprint().getName(), storyPointMapping.getAcceptedStoryPoint() - storyPointMapping.getCommitedStoryPoint(), storyPointMapping.getCommitedStoryPoint(), 0));
            } else if (storyPointMapping.getAcceptedStoryPoint() < storyPointMapping.getCommitedStoryPoint()) {
                scopeChanges.add(new ScopeChangeDTO(storyPointMapping.getSprint().getName(), 0, storyPointMapping.getCommitedStoryPoint(), storyPointMapping.getCommitedStoryPoint() - storyPointMapping.getAcceptedStoryPoint()));
            } else {
                scopeChanges.add(new ScopeChangeDTO(storyPointMapping.getSprint().getName(), 0, storyPointMapping.getCommitedStoryPoint(), 0));
            }
        }
        return scopeChanges;

    }

    public List<SprintPriorityDTO> calculatePriority() {


        List<PriorityDetails> priorityDetailsList = ( ArrayList<PriorityDetails>)priorityDetailsRepo.findAll();;
        List<SprintPriorityDTO> sprintPriorityDTOS = new ArrayList<>();
        Map<String,SprintPriorityDTO> sprintPriorityMaps = new HashMap<>();

        System.out.println(priorityDetailsList);
        if (!priorityDetailsList.isEmpty()) {
            for (PriorityDetails priorityDetails : priorityDetailsList) {

                SprintPriorityDTO sprintPriorityDTO = new SprintPriorityDTO();
                sprintPriorityDTO.setSprintName(priorityDetails.getSprint().getName());
                sprintPriorityMaps.put(priorityDetails.getSprint().getName(), sprintPriorityDTO);
                }

            for (PriorityDetails priorityDetails : priorityDetailsList) {
                SprintPriorityDTO sprintPriorityDTO = sprintPriorityMaps.get(priorityDetails.getSprint().getName());
                if (priorityDetails.getPriority().equalsIgnoreCase("LOWEST")) {
                    sprintPriorityDTO.setLowest(sprintPriorityDTO.getLowest() + priorityDetails.getPriorityCount());
                } else if (priorityDetails.getPriority().equalsIgnoreCase("high")) {
                    sprintPriorityDTO.setHigh(sprintPriorityDTO.getHigh() + priorityDetails.getPriorityCount());
                } else if (priorityDetails.getPriority().equalsIgnoreCase("low")) {
                    sprintPriorityDTO.setLow(sprintPriorityDTO.getLow() + priorityDetails.getPriorityCount());
                } else if (priorityDetails.getPriority().equalsIgnoreCase("highest")) {
                    sprintPriorityDTO.setHighest(sprintPriorityDTO.getHighest() + priorityDetails.getPriorityCount());
                } else if (priorityDetails.getPriority().equalsIgnoreCase("medium")) {
                    sprintPriorityDTO.setMedium(sprintPriorityDTO.getMedium() + priorityDetails.getPriorityCount());
                }
            }
        }

        for (Map.Entry<String,SprintPriorityDTO> d: sprintPriorityMaps.entrySet()) {
            sprintPriorityDTOS.add(d.getValue());
        }

        return sprintPriorityDTOS;
    }


}

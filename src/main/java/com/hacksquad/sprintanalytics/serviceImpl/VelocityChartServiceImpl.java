package com.hacksquad.sprintanalytics.serviceImpl;


import com.hacksquad.sprintanalytics.component.VelocityChartComponent;
import com.hacksquad.sprintanalytics.dto.ScopeChangeDTO;
import com.hacksquad.sprintanalytics.dto.SprintPriorityDTO;
import com.hacksquad.sprintanalytics.dto.VelocityTrendDTO;
import com.hacksquad.sprintanalytics.service.VelocityChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class VelocityChartServiceImpl implements VelocityChartService {

    @Autowired
    VelocityChartComponent velocityChartComponent;

	// velocity test1
    public  List<VelocityTrendDTO> getVelocityTrend() {
     return velocityChartComponent.calculateVelocityTrend();
    }

    public  List<VelocityTrendDTO> getSucessRate() {
        return velocityChartComponent.calculateSuccessRate();
    }

    public List<ScopeChangeDTO> getScopeChange(){
        return  velocityChartComponent.calculateScopeChange();
    }

    public List<SprintPriorityDTO> getPriotiy()
    {
        return   velocityChartComponent.calculatePriority();
    }

}

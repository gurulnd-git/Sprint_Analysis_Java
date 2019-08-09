package com.hacksquad.sprintanalytics.service;

import com.hacksquad.sprintanalytics.dto.ScopeChangeDTO;
import com.hacksquad.sprintanalytics.dto.SprintPriorityDTO;
import com.hacksquad.sprintanalytics.dto.VelocityTrendDTO;

import java.util.List;

public interface VelocityChartService {

    public List<VelocityTrendDTO> getVelocityTrend();

    public List<VelocityTrendDTO> getSucessRate();

    public List<ScopeChangeDTO> getScopeChange();

    public List<SprintPriorityDTO> getPriotiy();
}

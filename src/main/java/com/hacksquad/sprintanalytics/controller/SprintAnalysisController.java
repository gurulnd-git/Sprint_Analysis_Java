package com.hacksquad.sprintanalytics.controller;


import com.hacksquad.sprintanalytics.dto.ScopeChangeDTO;
import com.hacksquad.sprintanalytics.dto.SprintPriorityDTO;
import com.hacksquad.sprintanalytics.dto.VelocityTrendDTO;
import com.hacksquad.sprintanalytics.serviceImpl.VelocityChartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("analysis")
public class SprintAnalysisController {

    @Autowired
    VelocityChartServiceImpl velocityChartService;

    @GetMapping("velocity-trend")
    public ResponseEntity<List<VelocityTrendDTO>> getVelocityTrendDetails(){

        return  new ResponseEntity<List<VelocityTrendDTO>>(velocityChartService.getVelocityTrend(), HttpStatus.OK);

    }
    @GetMapping("success-rate")
    public ResponseEntity<List<VelocityTrendDTO>> getSuccessRate(){

        return  new ResponseEntity<List<VelocityTrendDTO>>(velocityChartService.getSucessRate(), HttpStatus.OK);

    }
    @GetMapping("scope-change")
    public ResponseEntity<List<ScopeChangeDTO>> getScopeChange(){

        return  new ResponseEntity<List<ScopeChangeDTO>>(velocityChartService.getScopeChange(), HttpStatus.OK);

    }

        @GetMapping("priority-mapping")
    public ResponseEntity<List<SprintPriorityDTO>> getPriorityMapping(){

        return  new ResponseEntity<List<SprintPriorityDTO>>(velocityChartService.getPriotiy(), HttpStatus.OK);

    }
}

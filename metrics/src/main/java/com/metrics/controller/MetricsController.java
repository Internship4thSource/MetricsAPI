package com.metrics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.metrics.domain.CreateMetricRequest;
import com.metrics.service.MappingTest;
import com.metrics.service.MetricsServiceImpl;

@RestController
public class MetricsController 
{

	@Autowired
	MetricsServiceImpl service;
	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping("/metrics")
	public String newMetric(@RequestBody CreateMetricRequest request) 
	{
		 String id= "";
		MappingTest test = new MappingTest();
		if(test.MappingTestMetric(request))
			 id = service.newMetric(request).getId();
		
		 return id;

	}
	
}

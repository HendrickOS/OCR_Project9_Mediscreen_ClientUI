package com.project9.Mediscreen_ClientUI.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project9.Mediscreen_ClientUI.beans.AssessmentBean;
import com.project9.Mediscreen_ClientUI.beans.PatientAssessmentBean;

@FeignClient(name = "microservice-assessment", url = "localhost:8083")
public interface MicroserviceAssessmentsProxy {

	@PostMapping("/assessment")
	AssessmentBean assessmentOfPatient(@RequestBody PatientAssessmentBean patientAssessment);

}

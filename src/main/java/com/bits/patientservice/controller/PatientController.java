package com.bits.patientservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bits.patientservice.model.PatientInfo;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@RequestMapping("/{patientID}")
	public PatientInfo getDoctor(@PathVariable("patientID") String patientID)
	{
		return new PatientInfo(1,"Haridas Pal", "Heart Attack");
	}

}

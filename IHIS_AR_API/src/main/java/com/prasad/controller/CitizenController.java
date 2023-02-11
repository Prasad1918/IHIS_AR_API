package com.prasad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.binding.CitizenApp;
import com.prasad.entity.CitizenAppEntity;
import com.prasad.service.AppRegService;

@RestController
public class CitizenController {
   @Autowired
	AppRegService appRegService;
	@PostMapping("/appreg")
	public ResponseEntity<String> createApp(@RequestBody CitizenApp app){
		String msg=	appRegService.createCitizen(app);
		return new ResponseEntity<>(msg,HttpStatus.OK);
}
	
	@GetMapping("/viewapplication")
	public List<CitizenApp> viewApplication(){
		
		return appRegService.viewApplication();
	}
}

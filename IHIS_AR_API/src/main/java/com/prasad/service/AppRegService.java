package com.prasad.service;

import java.util.List;

import com.prasad.binding.CitizenApp;

public interface AppRegService {
 public String createCitizen(CitizenApp citizenapp);
 
 public List<CitizenApp> viewApplication();
 
}

package com.prasad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.prasad.binding.CitizenApp;
import com.prasad.entity.CitizenAppEntity;
import com.prasad.repository.CitizenAppRepo;

@Service
public class AppRegServiceImpl implements AppRegService {

	@Autowired
	CitizenAppRepo citizenAppRepo;

	@Override
	public String createCitizen(CitizenApp citizenapp) {
		// TODO Auto-generated method stub

		
		/*
		 * String sssaurl=
		 * "http://ssawebapi-env.eba-k88bsahp.ap-south-1.elasticbeanstalk.com/ssn/{ssn}";
		 * 
		 * RestTemplate rs =new RestTemplate(); ResponseEntity<String>
		 * responseEntity=rs.getForEntity(sssaurl,String.class, citizenapp.getZzn());
		 * String stateName= responseEntity.getBody();
		 */
		String stateName="New Jersey";
		  if("New Jersey".equals(stateName))
		  
		  { citizenapp.setStateName(stateName);
		  CitizenAppEntity citizenEntity=new CitizenAppEntity();
		  BeanUtils.copyProperties(citizenapp, citizenEntity);
		  citizenAppRepo.save(citizenEntity); 
		  return "Citen Application Success"; 
		  }
		 
		return "not New Jersy Citizen";
	}

	@Override
	public List<CitizenApp> viewApplication() {
		// TODO Auto-generated method stub

		List<CitizenAppEntity> entitys = citizenAppRepo.findAll();

		List<CitizenApp> apps = new ArrayList<>();
		entitys.forEach(entiys -> {
			CitizenApp citizenapp = new CitizenApp();
			BeanUtils.copyProperties(entiys, citizenapp);
			apps.add(citizenapp);
		});
		return null;
	}

}

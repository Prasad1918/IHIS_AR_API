package com.prasad.binding;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Data;

@Data
public class CitizenApp {

	private Long caseNum;
	private String fullName;
	private String eamil;
	private Integer mobileNum;
	private String gender;
	private LocalDate dob;
	private Integer ssn;
	private String stateName;

}

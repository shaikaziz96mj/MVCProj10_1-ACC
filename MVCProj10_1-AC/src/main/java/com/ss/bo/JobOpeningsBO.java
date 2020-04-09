package com.ss.bo;

import lombok.Data;

@Data
public class JobOpeningsBO {

	private int jobid;
	private String company;
	private String domain;
	private String position;
	private String salaryRange;
	private String expRequired;
	private int numberOfOpenings;
	private String location;
	
}

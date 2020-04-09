package com.ss.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class JobOpeningsDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int srNum;
	private int jobid;
	private String company;
	private String domain;
	private String position;
	private String salaryRange;
	private String expRequired;
	private int numberOfOpenings;
	private String location;
	
}

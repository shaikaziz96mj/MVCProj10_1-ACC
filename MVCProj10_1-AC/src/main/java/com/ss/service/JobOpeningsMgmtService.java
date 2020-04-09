package com.ss.service;

import java.util.List;

import com.ss.dto.JobOpeningsDTO;

public interface JobOpeningsMgmtService {

	public List<JobOpeningsDTO> fetchJobOpeningsList();
	
}

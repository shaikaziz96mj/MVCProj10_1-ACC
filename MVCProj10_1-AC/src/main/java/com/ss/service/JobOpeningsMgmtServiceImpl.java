package com.ss.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.ss.bo.JobOpeningsBO;
import com.ss.dao.JobOpeningsDAO;
import com.ss.dto.JobOpeningsDTO;

public class JobOpeningsMgmtServiceImpl implements JobOpeningsMgmtService {

	private JobOpeningsDAO dao;
	
	public JobOpeningsMgmtServiceImpl(JobOpeningsDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<JobOpeningsDTO> fetchJobOpeningsList() {
		
		List<JobOpeningsBO> listBO=null;
		List<JobOpeningsDTO> listDTO=new ArrayList<JobOpeningsDTO>();
		
		//use dao
		listBO=dao.getAllOpeningsList();
		//convert listBO objects to listDTO
		listBO.forEach(bo->{
			JobOpeningsDTO dto=new JobOpeningsDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSrNum(listDTO.size()+1);
			listDTO.add(dto);
		});
		return listDTO;
	}//method
}//class
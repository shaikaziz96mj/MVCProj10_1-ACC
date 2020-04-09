package com.ss.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ss.dto.JobOpeningsDTO;
import com.ss.service.JobOpeningsMgmtService;

public class ListJobOpeningsController extends AbstractController {

	private JobOpeningsMgmtService service;
	
	public ListJobOpeningsController(JobOpeningsMgmtService service) {
		this.service = service;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		List<JobOpeningsDTO> listDTO=null;
		ModelAndView mav=null;
		
		//use serice
		listDTO=service.fetchJobOpeningsList();
		mav=new ModelAndView();
		//add objects to mav
		mav.addObject("listJobs",listDTO);
		mav.addObject("sysDate",new Date());
		mav.setViewName("show_list");
		return mav;
	}
}
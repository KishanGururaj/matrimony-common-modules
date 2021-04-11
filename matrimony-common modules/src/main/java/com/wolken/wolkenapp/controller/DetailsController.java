package com.wolken.wolkenapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.DetailsDTO;
import com.wolken.wolkenapp.entity.DetailsEntity;
import com.wolken.wolkenapp.service.DetailsService;

@Controller
@RequestMapping("/")
public class DetailsController {
	@Autowired
	DetailsService service;
	Logger logger=Logger.getLogger("DetailsController");
	@RequestMapping("details.do")
	public String details(@ModelAttribute DetailsDTO detailsDTO ,HttpServletRequest req) {
		logger.info("inside details method inside in DetailsController");
		String msg=service.validateAndAddDetails(detailsDTO);
		logger.info(msg+" is output to page");
		req.setAttribute("msg", msg);
		return "searchbygender.jsp";
		
	}
	@RequestMapping("getbygender.do")
	public String getAllDetailsByGender(HttpServletRequest req) {
		logger.info("inside get all details by gender inside in DetailsController");
		String gender=req.getParameter("gender");
		List <DetailsEntity>detailsList=service.validateAndGetDetailsByGender(gender);
		req.setAttribute("detailsList", detailsList);
		return "searchbygender.jsp";
	}

}

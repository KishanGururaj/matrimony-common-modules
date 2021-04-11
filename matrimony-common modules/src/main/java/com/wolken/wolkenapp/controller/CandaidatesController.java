package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.CandidatesDTO;
import com.wolken.wolkenapp.service.CandidatesService;

@Controller
@RequestMapping("/")
public class CandaidatesController {
	@Autowired
	CandidatesService service;
	Logger logger=Logger.getLogger("CandaidatesController");
	
	@RequestMapping("/signup.do")
	public String save(@ModelAttribute CandidatesDTO candidatesDTO,HttpServletRequest req) {
	try {
		logger.info("inside save inside controller");
		String msg=service.validateAndSave(candidatesDTO);
		logger.info("ended validate and save "+msg+" output");
		req.setAttribute("msg", msg);
		return "login.jsp";
	}catch(NullPointerException e) {
		e.printStackTrace();
		
	}return null;
		
	}

}

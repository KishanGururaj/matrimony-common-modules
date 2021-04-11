package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.CandidatesEntity;
import com.wolken.wolkenapp.service.UpdateService;

@Controller
@RequestMapping("/")
public class UpdateController {
	@Autowired
	UpdateService service;
	Logger logger=Logger.getLogger("UpdateController");
	@RequestMapping("email.do")
	public String getByEmailId(HttpServletRequest req) {
		logger.info("inside get by email id inside UpdateController");
		String emailId=(String) req.getParameter("emailId");
		CandidatesEntity entity=service.validateAndGet(emailId);
		req.setAttribute("entity",entity );
		
		return "update.jsp";
		
	}
	@RequestMapping("update.do")
	public String update(UpdateDTO updateDTO, HttpServletRequest req) {
		logger.info("inside update method inside UpdateController");
		
		String msg=service.validateAndUpdate(updateDTO);
		req.setAttribute("msg", msg);
		return "final.jsp";
		
	}
}

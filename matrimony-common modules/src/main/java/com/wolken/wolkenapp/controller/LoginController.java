package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	LoginService service;
	
	@RequestMapping("login.do")
	public String login(LoginDTO dto, HttpServletRequest req) {
		String msg=service.validateAndLogin(dto);
		req.setAttribute("msg", msg);
		return "home.jsp";
		
	}

}

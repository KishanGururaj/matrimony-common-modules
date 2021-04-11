package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.LoginDAO;
import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.entity.LoginEntity;
@Service
public class LoginServiceImpl  implements LoginService{
	@Autowired
	LoginDAO dao;
	Logger logger=Logger.getLogger("LoginServiceImpl");
	@Override
	public String validateAndLogin(LoginDTO dto) {
		// TODO Auto-generated method stub
		if(dto!=null) {
			logger.info("inside null check inside validate and login ");
			LoginEntity entity=dao.login(dto.getUserName());
			if(entity!=null) {
				if(dto.getUserName().equals(entity.getUserName())){
					logger.info("username is same inside validate and login");
					if(dto.getPassword().equals(entity.getPassword())) {
						logger.info("inside password inside validate and login");
						return "Login Successfully";
						
					}else {
						logger.error("password is incorrect");
						return "password is incorrect";
					}
				}else {
					logger.info("username and password is incorrect");
					return "username not found ";
				}
					
			}else {
				logger.info("user name is null inside validate and login");
			}
		}
		
		return "invalid user name and password";
	}

}

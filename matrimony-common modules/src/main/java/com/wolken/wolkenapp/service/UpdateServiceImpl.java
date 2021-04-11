package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.LoginDAO;
import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.CandidatesEntity;
@Service
public class UpdateServiceImpl  implements UpdateService{
	@Autowired
	LoginDAO dao;
	Logger logger=Logger.getLogger("UpdateServiceImpl");
	@Override
	public CandidatesEntity validateAndGet(String emailId) {
		// TODO Auto-generated method stub
		logger.info("inside validate and get inside UpdateServiceImpl ");
		if(emailId!=null) {
			logger.info("email is not null in validate and get UpdateServiceImpl");
			return dao.getByEmailId(emailId);
		}
		logger.info("email id inside validate and get in UpdateServiceImpl");
		return null;
	}
	@Override
	public String validateAndUpdate(UpdateDTO updateDTO) {
		// TODO Auto-generated method stub
		logger.info("inside validate and update inside UpdateServiceImpl");
		if(updateDTO.getCandidateName()!=null) {
			logger.info("inside candidate name not null inside validate and update in UpdateServiceImpl");
			if(updateDTO.getCandidateDob()!=null) {
				logger.info("inside dob is not null inside validate and update in UpdateServiceImpl");
				if(updateDTO.getCandidateGender()!=null) {
					logger.info("inside gender is not null inside validate and update in UpdateServiceImpl");
					if(updateDTO.getCandidatePhoneNo()>0) {
						logger.info("inside phone no id not null inside validate and update in UpdateServiceImpl");
						logger.info("inside update detailos method passed to dao in inside validate and update in UpdateServiceImpl");
						return dao.updateDetails(updateDTO);
					}
				}
			}
		}
		return null;
	}

}

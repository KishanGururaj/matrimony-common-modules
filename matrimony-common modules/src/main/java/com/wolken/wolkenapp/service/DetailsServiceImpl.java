package com.wolken.wolkenapp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.DetailsDAO;
import com.wolken.wolkenapp.dto.DetailsDTO;
import com.wolken.wolkenapp.entity.DetailsEntity;
import com.wolken.wolkenapp.exception.CandidatesGenderException;
@Service
public class DetailsServiceImpl implements DetailsService {
	@Autowired
	DetailsDAO dao;
	@Autowired
	DetailsEntity entity;
	Logger logger = Logger.getLogger("DetailsServiceImpl");

	@Override
	public String validateAndAddDetails(DetailsDTO detailsDTO) {
		// TODO Auto-generated method stub
		if (detailsDTO.getCandidateFullName() != null) {
			logger.info("candidate full name is  not null in validate and add details inside DetailsServiceImpl");
			if (detailsDTO.getCandidateCaste() != null) {
				logger.info("candidate caste is  not null in validate and add details inside DetailsServiceImpl");
				if (detailsDTO.getCandidateDesire() != null) {
					logger.info("candidate desire is  not null in validate and add details inside DetailsServiceImpl");
					if (detailsDTO.getCandidateSalary() > 0) {
						logger.info("candidate salary is  greater than 0 in validate and add details inside DetailsServiceImpl");
						if(detailsDTO.getCandidateGender()!=null) {
						entity.setCandidateFullName(detailsDTO.getCandidateFullName());
						entity.setCandidateCaste(detailsDTO.getCandidateCaste());
						entity.setCandidateDesire(detailsDTO.getCandidateDesire());
						entity.setCandidateSalary(detailsDTO.getCandidateSalary());
						entity.setCandidateGender(detailsDTO.getCandidateGender());
						return dao.update(entity);
						}else {
							logger.error("candidate gender is not null");
						}
					} else {
						logger.error("candidate salary is null");
					}
				} else {
					logger.error("candidate desire is null");
				}
			} else {
				logger.info("candidate caste is null");
			}
		}else {
			logger.info("candidate full name is null");
		}
		return null;
	}

	@Override
	public List<DetailsEntity> validateAndGetDetailsByGender(String gender){
		// TODO Auto-generated method stub
		if(gender!=null) {
		logger.info("inside validate and get details by gender inside DetailsServiceImpl ");
		return dao.getDetailsByGender(gender);
		}else {
			logger.info("inside gender is null  inside get details by gender inside DetailsServiceImpl");
			return null;
			
		}
		
	}

}

package com.wolken.wolkenapp.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.CandidatesDAO;
import com.wolken.wolkenapp.dto.CandidatesDTO;
import com.wolken.wolkenapp.entity.CandidatesEntity;
import com.wolken.wolkenapp.exception.CandidatesDobExecption;
import com.wolken.wolkenapp.exception.CandidatesEmailException;
import com.wolken.wolkenapp.exception.CandidatesException;
import com.wolken.wolkenapp.exception.CandidatesGenderException;
import com.wolken.wolkenapp.exception.CandidatesPasswordException;
import com.wolken.wolkenapp.exception.CandidatesPhoneNoException;

@Service
public class CandidatesServiceImpl implements CandidatesService {
	@Autowired
	CandidatesDAO dao;

	Logger logger = Logger.getLogger("CandidatesServiceImpl");

	public String validateAndSave(CandidatesDTO candidatesDTO) {
		// TODO Auto-generated method stub
		try {
		if (candidatesDTO.getCandidateName() != null) {
			logger.info("candidate name is not null");
			if (candidatesDTO.getCandidateEmailId() != null) {
				logger.info("candidate email id is not null");
				if (candidatesDTO.getCandidatePhoneNo() > 0) {
					logger.info("candidate phNo is not null");
					if (candidatesDTO.getCandidateDob() != null) {
						logger.info("candidate dob is not null");
						if (candidatesDTO.getCandidateGender() != null) {
							logger.info("candaidate gender is not null");
							if (candidatesDTO.getCandidatePassword() != null) {
								logger.info("candidate password is not null");
								if (candidatesDTO.getCandidateConfirmPassword() != null) {
									logger.info("inside null check");
									CandidatesEntity candidatesEntity = new CandidatesEntity();
									CandidatesEntity candidatesEntity1 = dao.getUserName(candidatesDTO.getCandidateName());
									logger.info(candidatesEntity1);
									if (candidatesEntity1 == null) {
										logger.info("inside null check for username already there");
										candidatesEntity.setCandidateName(candidatesDTO.getCandidateName());
										candidatesEntity.setCandidateEmailId(candidatesDTO.getCandidateEmailId());
										candidatesEntity.setCandidatePhoneNo(candidatesDTO.getCandidatePhoneNo());
										candidatesEntity.setCandidateDob(candidatesDTO.getCandidateDob());
										candidatesEntity.setCandidateGender(candidatesDTO.getCandidateGender());
										candidatesEntity.setCandidatePassword(candidatesDTO.getCandidatePassword());
										candidatesEntity.setCandidateConfirmPassword(candidatesDTO.getCandidateConfirmPassword());
										return dao.save(candidatesEntity);
									}else {
										
										logger.info("inside else for validate and save ");
										return "user already exits";
										
									}

								} else {
									logger.error("confirm password is null inside validate and save ");
									throw new CandidatesException();
								}
							} else {
								logger.error("password is null inside validate and save");
								throw new CandidatesPasswordException();
							}
						} else {
							logger.error("gender is null inside validate and save");
							throw new CandidatesGenderException();
						}

					} else {
						logger.error("DOB is null inside validate and save");
						throw new CandidatesDobExecption();
					}
				} else {
					logger.error("phone no is null inside validate and save");
					throw new CandidatesPhoneNoException();
				}
			} else {
				logger.error("email Id is null inside validate and save");
				throw new CandidatesEmailException();
			}
		} else {
			logger.error("name  is null inside validate and save");
			throw new CandidatesException();
		}}
		catch(CandidatesException | CandidatesDobExecption| CandidatesEmailException |CandidatesGenderException |CandidatesPasswordException |CandidatesPhoneNoException e) {
			logger.info("entered into catch block inside validate and save ");
			e.printStackTrace();
		}
		return null;
	}

}

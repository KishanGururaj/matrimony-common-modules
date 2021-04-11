package com.wolken.wolkenapp.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.CandidatesEntity;
import com.wolken.wolkenapp.entity.LoginEntity;
@Component
public class LoginDAOImpl implements LoginDAO {
	
	@Autowired
	LocalSessionFactoryBean bean;
	Logger logger=Logger.getLogger("LoginDAOImpl");
	@Override
	public LoginEntity login(String  userName) {
		// TODO Auto-generated method stub
		try {
		logger.info("inside  login method in Logindao");
		SessionFactory factory=bean.getObject();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("from LoginEntity le where le.userName=:userName");
		query.setParameter("userName",userName );
		LoginEntity entity=(LoginEntity) query.uniqueResult();
		logger.info(entity);
		session.close();
		return entity;
		}catch(Exception e) {
			e.printStackTrace();
			logger.info("inside catch block inside login inside LoginDAOImpl");
		}
		return null;
	}
	@Override
	public CandidatesEntity getByEmailId(String emailId) {
		// TODO Auto-generated method stub
		try {
		logger.info("inside  get by email method in Logindao");
		SessionFactory factory=bean.getObject();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("from CandidatesEntity ce where ce.candidateEmailId=:candidateEmailId");
		query.setParameter("candidateEmailId",emailId );
		CandidatesEntity entity=(CandidatesEntity) query.uniqueResult();
		logger.info(entity);
		session.close();
		
		return entity;
		}catch(Exception e) {
			e.printStackTrace();
			logger.info("inside get by emial id inside LoginDAOImpl");
			
		}
		return null;
	}
	@Override
	public String updateDetails(UpdateDTO updateDTO) {
		// TODO Auto-generated method stub
		try {
		logger.info("inside update details inside LoginDAOImpl");
		SessionFactory factory=bean.getObject();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		logger.info("inside query inside update details");
		Query query=session.createQuery("update CandidatesEntity ce set ce.candidateName=:candidateName,ce.candidatePhoneNo=:candidatePhoneNo,ce.candidateDob=:candidateDob,ce.candidateGender=:candidateGender where ce.candidateEmailId=:candidateEmailId");
		query.setParameter("candidateName",updateDTO.getCandidateName() );
		query.setParameter("candidatePhoneNo",updateDTO.getCandidatePhoneNo() );
		query.setParameter("candidateDob",updateDTO.getCandidateDob() );
		query.setParameter("candidateGender",updateDTO.getCandidateGender() );
		query.setParameter("candidateEmailId",updateDTO.getCandidateEmailId());
		query.executeUpdate();
		logger.info("closing session inside update details");
		
		transaction.commit();
		session.close();
		return "update successfull";
		}catch(Exception e) {
			logger.info("inside catch block inside update details inside LoginDAOImpl");
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return "update unsucessfull";
	}

}

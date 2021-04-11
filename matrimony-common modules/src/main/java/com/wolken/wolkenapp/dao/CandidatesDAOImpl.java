package com.wolken.wolkenapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.CandidatesEntity;

@Component
public class CandidatesDAOImpl implements CandidatesDAO {

	@Autowired
	LocalSessionFactoryBean bean;

	Logger logger = Logger.getLogger("CandidatesDAOImpl");

	public String save(CandidatesEntity candidatesEntity) {
		// TODO Auto-generated method stub
		try {
			logger.info("inside DAO save method");
			SessionFactory factory = bean.getObject();
			logger.info("bean get object done and session factory created");
			Session session = factory.openSession();
			logger.info("session is opened");
			Transaction transaction = session.beginTransaction();
			logger.info("transcation is opened");
			session.save(candidatesEntity);
			logger.info("end of save for session");
			transaction.commit();
			logger.info("transcation is committed");
			session.close();
			logger.info("session is closed");
			return "data added successfully";
		} catch (NullPointerException | IllegalArgumentException e) {
			logger.info("inside catch block dao impl");
			e.printStackTrace();
		}
		return null;
	}

	public CandidatesEntity getUserName(String candidateName) {
		// TODO Auto-generated method stub
		try {
			logger.info("inside get user name ");
			SessionFactory factory = bean.getObject();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery("from CandidatesEntity ce where ce.candidateName=:candidateName");
			query.setParameter("candidateName", candidateName);
			CandidatesEntity candidatesEntity = (CandidatesEntity) query.uniqueResult();
			logger.info(candidatesEntity);
			return candidatesEntity;
		} catch (NullPointerException | IllegalArgumentException e) {
			logger.info("inside catch block of get user name");
			e.printStackTrace();
		}
		return null;
	}

}

package com.wolken.wolkenapp.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.CandidatesEntity;
import com.wolken.wolkenapp.entity.DetailsEntity;

@Component
public class DetailsDAOImpl implements DetailsDAO {
	@Autowired
	LocalSessionFactoryBean bean;
	Logger logger = Logger.getLogger("DetailsDAOImpl");

	@Override
	public String update(DetailsEntity entity) {
		// TODO Auto-generated method stub
		try {
			logger.info("inside  DetailsDAO save method");
			SessionFactory factory = bean.getObject();
			logger.info("bean get object done and session factory created");
			Session session = factory.openSession();
			logger.info("session is opened");
			Transaction transaction = session.beginTransaction();
			logger.info("transcation is opened");
			session.save(entity);
			logger.info("end of save for session");
			transaction.commit();
			logger.info("transcation is committed");
			session.close();
			logger.info("session is closed");
			return "data added details successfully";
		} catch (Exception e) {
			logger.info("inside catch block  details dao impl");
			e.printStackTrace();
		}
		return "details is not added ";

	}

	@Override
	public List<DetailsEntity> getDetailsByGender(String gender) {
		// TODO Auto-generated method stub
		try {
		logger.info("inside get details by gender ");
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from DetailsEntity de where de.candidateGender=:candidateGender");
		query.setParameter("candidateGender", gender);
		List<DetailsEntity >detailsDTOS = query.list();
		logger.info(detailsDTOS);
		return detailsDTOS;
	}catch(Exception e){
		logger.info("inside catch block of get details by gender");
		e.printStackTrace();
	}

	return null;
}

}

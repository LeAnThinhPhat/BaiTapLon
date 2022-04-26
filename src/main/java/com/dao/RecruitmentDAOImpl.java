package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Recruitment;
@Transactional
@Repository
public class RecruitmentDAOImpl implements RecruitmentDAO{
	@Autowired
    private SessionFactory sessionFactory;
	@Transactional
	@Override
	public List<Recruitment> getRecruitments() {
			Session currentSession = sessionFactory.getCurrentSession();
	        Query<Recruitment> theQuery
	                = currentSession.createQuery("from Recruitment", Recruitment.class);
	        // execute query and get result list
	        List<Recruitment> recruitments = theQuery.getResultList();
	        return recruitments;
	}

	@Override
	public Recruitment getRecruitment(int theId) {
			Session currentSession = sessionFactory.getCurrentSession();
	        // now retrieve/read from database using the primary key
	        Recruitment theRecruitment = currentSession.get(Recruitment.class, theId);
	        return theRecruitment;
	}

}

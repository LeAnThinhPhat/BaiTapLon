package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.SocialMedia;
@Transactional
@Repository
public class SocialMediaDAOImpl implements SocialMediaDAO{
	@Autowired
    private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<SocialMedia> getSocialMedias() {
		 Session currentSession = sessionFactory.getCurrentSession();
	        Query<SocialMedia> theQuery
	                = currentSession.createQuery("from SocialMedia", SocialMedia.class);
	        // execute query and get result list
	        List<SocialMedia> socialMedias = theQuery.getResultList();
	        return socialMedias;
	}

	@Override
	public SocialMedia getSocialMedia(int theId) {
		 Session currentSession = sessionFactory.getCurrentSession();
        // now retrieve/read from database using the primary key
        SocialMedia theSocialMedia = currentSession.get(SocialMedia.class, theId);
        return theSocialMedia;
	}
}

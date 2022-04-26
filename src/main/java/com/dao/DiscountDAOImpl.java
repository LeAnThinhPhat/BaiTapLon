package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Discount;
@Transactional
@Repository
public class DiscountDAOImpl implements DiscountDAO{
	@Autowired
    private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Discount> getDiscounts() {
		 Session currentSession = sessionFactory.getCurrentSession();
	        Query<Discount> theQuery
	                = currentSession.createQuery("from Discount", Discount.class);
	        // execute query and get result list
	        List<Discount> discounts = theQuery.getResultList();
	        return discounts;
	}

	@Override
	public Discount getDiscount(int theId) {
		// TODO Auto-generated method stub
		 Session currentSession = sessionFactory.getCurrentSession();
	        // now retrieve/read from database using the primary key
	        Discount theDiscount = currentSession.get(Discount.class, theId);
	        return theDiscount;
	}

}

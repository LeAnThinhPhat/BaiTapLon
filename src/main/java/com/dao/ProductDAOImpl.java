package com.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Person;
import com.entity.Product;
@Transactional
@Repository
public class ProductDAOImpl implements ProductDAO{
	@Autowired
    private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Product> getProducts() {
		  Session currentSession = sessionFactory.getCurrentSession();
	        Query<Product> theQuery
	                = currentSession.createQuery("from Product", Product.class);
	        // execute query and get result list
	        List<Product> products = theQuery.getResultList();
	        return products;
	}

	@Override
	public Product getProduct(int theId) {
		 // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // now retrieve/read from database using the primary key
        Product theProduct = currentSession.get(Product.class, theId);
        return theProduct;
	}

}

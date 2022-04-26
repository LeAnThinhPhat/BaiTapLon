package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DiscountDAO;
import com.entity.Discount;
@Service
public class DiscountServiceImpl implements DiscountService{
	@Autowired
	DiscountDAO discountDAO;
	@Override
	public List<Discount> getDiscounts() {
		// TODO Auto-generated method stub
		return discountDAO.getDiscounts();
	}

	@Override
	public Discount getDiscount(int theId) {
		// TODO Auto-generated method stub
		return discountDAO.getDiscount(theId);
	}

}

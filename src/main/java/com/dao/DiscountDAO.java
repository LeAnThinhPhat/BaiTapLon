package com.dao;

import java.util.List;

import com.entity.Discount;

public interface DiscountDAO {
	public List<Discount> getDiscounts();
	public Discount getDiscount(int theId);
}

package com.service;

import java.util.List;

import com.entity.Discount;

public interface DiscountService {
	public List<Discount> getDiscounts();
	public Discount getDiscount(int theId);
}

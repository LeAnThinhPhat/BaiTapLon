package com.dao;

import java.util.List;

import com.entity.Product;

public interface ProductDAO {
	public List<Product> getProducts();
	public Product getProduct(int theId);
}

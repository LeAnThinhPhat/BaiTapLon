package com.service;

import java.util.List;

import com.entity.Product;

public interface ProductService {
	public List<Product> getProducts();
	public Product getProduct(int productId);
}

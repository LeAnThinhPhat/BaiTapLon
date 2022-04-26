package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.Product;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDAO;
	
	@Transactional
	@Override
	public List<Product> getProducts() {
		return productDAO.getProducts();
	}

	@Override
	public Product getProduct(int productId) {
		return productDAO.getProduct(productId);
	}
	
}

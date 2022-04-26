package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Person;
import com.entity.Product;
import com.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/")
    public String listProduct(Model theModel) {
        // get persons from the service
        List<Product> Products = productService.getProducts();
        // add the customers to the model
        theModel.addAttribute("products", Products);
        return "list-product";
    }
	@GetMapping("/showDetailProduct")
    public String showDetailProduct(@RequestParam("productId") int theId,
            Model theModel) {
        // get the customer from our service
        Product theProduct = productService.getProduct(theId);
        // set customer as a model attribute to pre-populate the form
        theModel.addAttribute("product", theProduct);

        // send over to our form		
        return "detail-product";
    }
}

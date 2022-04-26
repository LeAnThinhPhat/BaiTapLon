package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Discount;
import com.service.DiscountService;
@Controller
public class DiscountController {
	@Autowired
	DiscountService discountService;
	@GetMapping("/discount")
    public String listDiscount(Model theModel) {
        // get persons from the service
        List<Discount> Discounts = discountService.getDiscounts();
        // add the customers to the model
        theModel.addAttribute("discounts", Discounts);
        return "list-discount";
    }
	@GetMapping("/discount-detail")
    public String showDetailDiscount(@RequestParam("discountId") int theId,
            Model theModel) {
        // get the customer from our service
        Discount theDiscount = discountService.getDiscount(theId);
        // set customer as a model attribute to pre-populate the form
        theModel.addAttribute("discount", theDiscount);

        // send over to our form		
        return "detail-discount";
    }
}

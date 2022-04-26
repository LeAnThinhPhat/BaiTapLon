package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Recruitment;
import com.service.RecruitmentService;

@Controller
public class RecruitmentController {
	@Autowired
	RecruitmentService recruitmentService;
	
	@GetMapping("/recruitment")
    public String listSocialMedia(Model theModel) {
        // get persons from the service
        List<Recruitment> Recruitments = recruitmentService.getRecruitments();
        // add the customers to the model
        theModel.addAttribute("recruitments", Recruitments);
        return "list-recruitment";
    }
	@GetMapping("/showDetailRecruitment")
    public String showDetailRecruitment(@RequestParam("RecruitmentId") int theId,
            Model theModel) {
        // get the customer from our service
        Recruitment recruitment = recruitmentService.getRecruitment(theId);
        // set customer as a model attribute to pre-populate the form
        theModel.addAttribute("recruitment", recruitment);

        // send over to our form		
        return "detail-recruitment";
    }
}

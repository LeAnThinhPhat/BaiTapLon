package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.SocialMedia;
import com.service.SocialMediaService;
@Controller
public class SocialMediaController {
	@Autowired
	SocialMediaService socialMediaService;
	
	@GetMapping("/social-media")
    public String listSocialMedia(Model theModel) {
        // get persons from the service
        List<SocialMedia> Socials = socialMediaService.getSocialMedias();
        // add the customers to the model
        theModel.addAttribute("socialMedias", Socials);
        return "list-social";
    }
	@GetMapping("/about")
    public String about() {
        return "about";
    }
	@GetMapping("/showDetailSocial")
    public String showDetailSocial(@RequestParam("socialId") int theId,
            Model theModel) {
        // get the customer from our service
        SocialMedia theSocialMedia = socialMediaService.getSocialMedia(theId);
        // set customer as a model attribute to pre-populate the form
        theModel.addAttribute("socialMedia", theSocialMedia);

        // send over to our form		
        return "detail-social";
    }
}

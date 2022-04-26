package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SocialMediaDAO;
import com.entity.SocialMedia;
@Service
public class SocialMediaSeviceImpl implements SocialMediaService{
	@Autowired
	private SocialMediaDAO socialMediaDAO;
	@Override
	public List<SocialMedia> getSocialMedias() {
		// TODO Auto-generated method stub
		return socialMediaDAO.getSocialMedias();
	}

	@Override
	public SocialMedia getSocialMedia(int theId) {
		// TODO Auto-generated method stub
		return socialMediaDAO.getSocialMedia(theId);
	}

}

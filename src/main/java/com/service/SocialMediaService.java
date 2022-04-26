package com.service;

import java.util.List;

import com.entity.SocialMedia;

public interface SocialMediaService {
	public List<SocialMedia> getSocialMedias();
	public SocialMedia getSocialMedia(int theId);
}

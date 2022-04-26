package com.dao;

import java.util.List;

import com.entity.SocialMedia;

public interface SocialMediaDAO {
	public List<SocialMedia> getSocialMedias();
	public SocialMedia getSocialMedia(int theId);
}

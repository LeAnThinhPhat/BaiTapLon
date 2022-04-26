package com.service;

import java.util.List;

import com.entity.Recruitment;

public interface RecruitmentService {
	public List<Recruitment> getRecruitments();
	public Recruitment getRecruitment(int theId);
}

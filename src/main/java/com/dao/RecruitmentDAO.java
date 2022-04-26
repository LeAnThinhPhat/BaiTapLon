package com.dao;

import java.util.List;

import com.entity.Recruitment;

public interface RecruitmentDAO {
	public List<Recruitment> getRecruitments();
	public Recruitment getRecruitment(int theId);
}

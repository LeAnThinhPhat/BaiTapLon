package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RecruitmentDAO;
import com.entity.Recruitment;
@Service
public class RecruitmentServiceImpl implements RecruitmentService{
	@Autowired
	private RecruitmentDAO recruitmentDAO;
	@Override
	public List<Recruitment> getRecruitments() {
		// TODO Auto-generated method stub
		return recruitmentDAO.getRecruitments();
	}

	@Override
	public Recruitment getRecruitment(int theId) {
		// TODO Auto-generated method stub
		return recruitmentDAO.getRecruitment(theId);
	}

}

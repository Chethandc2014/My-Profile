package com.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.dao.BaseDao;
import com.profile.entity.Employee;

@Service
public class ProfileService {

	@Autowired
	BaseDao baseDao;
	
	public String saveEmployee(Employee arg0) {
		String response="saved successfully.";
		try {
			baseDao.save(arg0);
		}catch(Exception e) {
			response=e.getMessage();
		}
		return response;
	}

	public Employee getProfile(String userName) {
		Employee emp=null;
		try {
			 emp = baseDao.findOne(userName);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	
}

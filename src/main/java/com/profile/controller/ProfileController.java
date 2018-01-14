package com.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.profile.entity.Employee;
import com.profile.service.ProfileService;

@RestController
public class ProfileController {

	@Autowired
	ProfileService profileService;
	

	@RequestMapping(value="/profile/{userName}",method=RequestMethod.GET)
	public Employee getProfile(@PathVariable String userName) {
		Employee employee = profileService.getProfile(userName);
		return employee;
	}
	
	@RequestMapping(value="/profile",method=RequestMethod.POST)
	public String saveProfile(@RequestBody Employee emp) {
		String response = profileService.saveEmployee(emp);
		return response;
	}
	
	
	
	
	
	
}

package com.profile.controller;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.profile.MyProfileApplication;
import com.profile.entity.Employee;



@RunWith(SpringRunner.class)
@SpringBootTest(classes=MyProfileApplication.class,webEnvironment=WebEnvironment.RANDOM_PORT)
public class ProfileControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetProfile() {
		ResponseEntity<Employee> response = restTemplate.getForEntity("/profile/Ravi", Employee.class);
		System.out.println(response);
	}

	@Test
	public void testSaveProfile() {
		Employee request=new Employee();
		request.setId("Ravi");
		request.setName("Ravi Chandra");
		ResponseEntity<String> response = restTemplate.postForEntity("/profile", request, String.class);
		System.out.println(response.getBody());
	}
	

}

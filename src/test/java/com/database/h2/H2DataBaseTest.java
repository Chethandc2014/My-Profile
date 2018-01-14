package com.database.h2;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.profile.MyProfileApplication;
import com.profile.dao.BaseDao;
import com.profile.entity.Employee;



@RunWith(SpringRunner.class)
@SpringBootTest(classes=MyProfileApplication.class)
public class H2DataBaseTest {

	@Autowired
	BaseDao baseDao;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		Employee emp=new Employee();
		emp.setId("1234");
		emp.setName("Chethan");
		emp.setProject("MyProject");
		baseDao.save(emp);
		
	}

}

package com.profile;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



//@EnableJpaRepositories
//@SpringBootConfiguration
@SpringBootApplication
public class MyProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProfileApplication.class, args);
	}
}

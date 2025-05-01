package com.sufi.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagement {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagement.class, args);
		System.err.println("Employee Details :");
	}

}

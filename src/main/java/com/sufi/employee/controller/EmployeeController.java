package com.sufi.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sufi.employee.entity.Employee;
import com.sufi.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	EmployeeService services;
	public EmployeeController(EmployeeService services) {
		super();
		this.services = services;
	}

 
	@PostMapping("/insert")
	public String saveDetails(@RequestBody Employee employee) {
		   String masg = services.insertDetails(employee);
		return masg;
		
	}
	@PostMapping("/multiple")
	public String insertMultipleData(@RequestBody List<Employee> employees) {
		String multipleData = services.insertMultipleData(employees);
		return multipleData;
		
	}
	@GetMapping("/allData")
	
	public List<Employee> getAllEmployeeData(){
		     List<Employee> employeeList = services.getEmployeeList();
		
		return employeeList;
		
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById( @PathVariable int id) {
		   Employee employeeById = services.getEmployeeById(id);
		
		return employeeById;
		
	}
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee) {
		    String updateEmployee = services.updateEmployee(employee);
		
		return updateEmployee;
		
	}
	
	@DeleteMapping("/{id}")
	public String EmployeeDeletedById(@PathVariable int id) {
		
		      String deleteEmployeeById = services.deleteEmployeeById(id);
		     return deleteEmployeeById;
		
	}

}

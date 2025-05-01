package com.sufi.employee.service;

import java.util.List;

import com.sufi.employee.entity.Employee;

public interface EmployeeService {

	public String insertDetails(Employee employee);
	
	public String insertMultipleData(List<Employee> employees);
	
	public List<Employee> getEmployeeList();
	
	public Employee getEmployeeById(int id);
	
	public String updateEmployee(Employee employee);
	
	public String deleteEmployeeById(int id);
}

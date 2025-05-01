package com.sufi.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sufi.employee.entity.Employee;
import com.sufi.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository repository;
	
	public EmployeeServiceImpl(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	// insert  create 
	public String insertDetails(Employee employee) {
		
		 String masg = repository.insertDetails(employee);
		return masg;
	}

	@Override
	// insert  create multiple data 
	public String insertMultipleData(List<Employee> employees) {
		 
		 String multipleData = repository.insertMultipleData(employees);
		return multipleData;
	}

	@Override
	// fetch employee by Id
	public Employee getEmployeeById(int id) {
		       Employee employeeId = repository.getEmployeeId(id);
		return employeeId;
	}

	@Override
	// fetch employee List
	public List<Employee> getEmployeeList() {
		       List<Employee> employeeList = repository.getEmployeeList();
		return employeeList;
	}

	@Override
	// update employee
	public String updateEmployee(Employee employee) {
		 String updateEmployee = repository.updateEmployee(employee);
		return updateEmployee;
	}

	@Override
	// delete by id
	public String deleteEmployeeById(int id) {
		      String employeeById = repository.deleteEmployeeById(id);
		return employeeById;
	}

}

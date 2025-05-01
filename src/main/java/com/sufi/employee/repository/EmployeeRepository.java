package com.sufi.employee.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.sufi.employee.entity.Employee;

@Repository
public class EmployeeRepository {

	SessionFactory sf;

	public EmployeeRepository(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	@SuppressWarnings("deprecation")

	// insert data

	public String insertDetails(Employee employee) {
		// insert ,update,delete --> need Trasaction
		// save naam k method session se lena hai

		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(employee);
		transaction.commit();
		session.close();
		return "Employee Data insert Successfully-";

	}
	// insert multiple data

	public String insertMultipleData(List<Employee> employees) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		for (Employee e : employees) {
			session.save(e);
		}
		tr.commit();
		session.close();

		return "Multiple Employee Deatils are inserted";

	}

	// getId
	public Employee getEmployeeId(int id) {
		Session session = sf.openSession();
		Employee employee = session.get(Employee.class, id);
		return employee;
	}
	
	  
	public List<Employee> getEmployeeList(){
		  Session session = sf.openSession();
			List<Employee> list = session.createQuery("from Employee").list();
		     return list;
		  
	  }
	
	public String updateEmployee(Employee employee) {
		   Session openSession = sf.openSession();
		       Transaction tr = openSession.beginTransaction();
		       openSession.update(employee);
		       tr.commit();
		       openSession.close();
		      return "Employee Details Updated Successfully....";
	}
	
	public String deleteEmployeeById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		          Employee employee = session.get(Employee.class, id);
		
		          tr.commit();
		          session.close();
		          return "Employee Data Deleted Successfully Id:"+id;
	}
	

}

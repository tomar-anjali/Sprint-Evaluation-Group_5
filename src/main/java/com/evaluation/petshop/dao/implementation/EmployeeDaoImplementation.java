package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
=======
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b

import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.EmployeeDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Employee;
import com.evaluation.petshop.repository.EmployeeRepository;

@Repository
<<<<<<< HEAD
public class EmployeeDaoImplementation implements EmployeeDao{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employee = employeeRepository.findAll();
		if(!employee.isEmpty()) return employee;
		else throw new DataNotFoundException("Validation failed");
	}

=======
public class EmployeeDaoImplementation implements EmployeeDao {
	
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b
}

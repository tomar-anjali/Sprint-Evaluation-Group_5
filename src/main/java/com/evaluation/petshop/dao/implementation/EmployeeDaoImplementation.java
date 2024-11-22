package com.evaluation.petshop.dao.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.EmployeeDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Employee;
import com.evaluation.petshop.repository.EmployeeRepository;

@Repository
public class EmployeeDaoImplementation implements EmployeeDao {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employee = employeeRepository.findAll();
		if (!employee.isEmpty())
			return employee;
		else
			throw new DataNotFoundException("Validation failed");
	}

}

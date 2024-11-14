package com.evaluation.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluation.petshop.models.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

package com.evaluation.petshop.models.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int employeeId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String position;
	@Column(name = "hire_date")
	private String hireDate;
	@Column(name = "phone_number")
	private String phoneNumber;
	private String email;

	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;

	@ManyToMany
	@JoinTable(name = "employee_pet_relationship", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "pet_id"))
	private List<Pet> pets;

}

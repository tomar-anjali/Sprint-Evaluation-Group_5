package com.evaluation.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluation.petshop.models.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

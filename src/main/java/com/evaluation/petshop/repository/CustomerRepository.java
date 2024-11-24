package com.evaluation.petshop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.evaluation.petshop.models.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//	@Query("SELECT c FROM Customer c WHERE c.name=?1")
//	Optional<List<Customer>> findByNameIgnoreCase(String name);

}

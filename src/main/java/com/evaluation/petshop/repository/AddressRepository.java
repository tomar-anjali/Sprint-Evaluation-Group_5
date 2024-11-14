package com.evaluation.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluation.petshop.models.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}

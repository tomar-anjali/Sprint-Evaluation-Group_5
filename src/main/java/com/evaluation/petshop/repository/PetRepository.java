package com.evaluation.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluation.petshop.models.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {

}

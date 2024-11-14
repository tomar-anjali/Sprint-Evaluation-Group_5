package com.evaluation.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluation.petshop.models.entity.PetCategory;

public interface PetCategoryRepository extends JpaRepository<PetCategory, Integer> {

}

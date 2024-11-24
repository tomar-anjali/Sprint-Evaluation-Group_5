package com.evaluation.petshop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.evaluation.petshop.models.entity.PetCategory;

public interface PetCategoryRepository extends JpaRepository<PetCategory, Integer> {
	@Query("SELECT p FROM PetCategory p WHERE p.name=?1")
//	@Query("SELECT p FROM PetCategory p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :name, '%'))")
	Optional<List<PetCategory>> findByNameContainingIgnoreCase(String name);
}

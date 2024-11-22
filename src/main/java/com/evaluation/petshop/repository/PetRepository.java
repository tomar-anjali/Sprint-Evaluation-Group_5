package com.evaluation.petshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.evaluation.petshop.models.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {
	@Query("SELECT p FROM Pet p WHERE p.petCategory.categoryId = :categoryId")
	List<Pet> findByCategory(@Param("categoryId") int categoryId);
}

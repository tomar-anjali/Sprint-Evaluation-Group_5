package com.evaluation.petshop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.evaluation.petshop.models.entity.PetFood;

public interface PetFoodRepository extends JpaRepository<PetFood, Integer> {
	@Query("SELECT p FROM PetFood p WHERE p.name = :name")
    Optional<PetFood> findByFoodName(@Param("name") String name);


}

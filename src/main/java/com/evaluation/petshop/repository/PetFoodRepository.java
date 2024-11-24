package com.evaluation.petshop.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
import org.springframework.data.repository.query.Param;
import com.evaluation.petshop.models.entity.PetFood;

public interface PetFoodRepository extends JpaRepository<PetFood, Integer> {
	@Query("select s from PetFood s where s.name = ?1")
    List<PetFood> findByName(String name);
	@Query("SELECT p FROM PetFood p WHERE p.name = :name")
    Optional<PetFood> findByFoodName(@Param("name") String name);
}

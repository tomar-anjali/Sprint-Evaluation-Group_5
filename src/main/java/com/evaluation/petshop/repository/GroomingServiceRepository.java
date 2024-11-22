package com.evaluation.petshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.evaluation.petshop.models.entity.GroomingService;

public interface GroomingServiceRepository extends JpaRepository<GroomingService, Integer> {
	@Query("SELECT g FROM GroomingService g WHERE g.available = true")
	List<GroomingService> findAllAvailableServices();

}

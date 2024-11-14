package com.evaluation.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluation.petshop.models.entity.Vaccination;

public interface VaccinationRepository extends JpaRepository<Vaccination, Integer> {

}

package com.evaluation.petshop.dao;

import java.util.List;

import com.evaluation.petshop.models.entity.Vaccination;

public interface VaccinationDao {
	public List<Vaccination> getAllVaccinations();

	public Vaccination getVaccinationById(int id);

	Vaccination saveVaccination(Vaccination vaccination);

}

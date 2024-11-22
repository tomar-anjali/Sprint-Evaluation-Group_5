package com.evaluation.petshop.dao;

<<<<<<< HEAD


public interface VaccinationDao {
	
=======
import java.util.List;

import com.evaluation.petshop.models.entity.Vaccination;

public interface VaccinationDao {
	public List<Vaccination> getAllVaccinations();

	public Vaccination getVaccinationById(int id);

	Vaccination saveVaccination(Vaccination vaccination);
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b

}

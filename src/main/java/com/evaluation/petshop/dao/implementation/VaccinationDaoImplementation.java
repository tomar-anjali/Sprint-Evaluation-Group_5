package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD


=======
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.VaccinationDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Vaccination;
import com.evaluation.petshop.repository.VaccinationRepository;

@Repository
<<<<<<< HEAD
public class VaccinationDaoImplementation implements VaccinationDao{
	
=======
public class VaccinationDaoImplementation implements VaccinationDao {
	@Autowired
	VaccinationRepository vaccinationRepository;
	
	@Override
	public List<Vaccination> getAllVaccinations() {
		return vaccinationRepository.findAll();
	}
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b

	@Override
	public Vaccination getVaccinationById(int id) {
		Optional<Vaccination> res = vaccinationRepository.findById(id);
		if (res.isEmpty()) {
		    throw new DataNotFoundException("Validation failed");
		}
		return res.get();
	}
	@Override
    public Vaccination saveVaccination(Vaccination vaccination) {
        return vaccinationRepository.save(vaccination);
    }
}

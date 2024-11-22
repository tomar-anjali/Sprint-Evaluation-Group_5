package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD

=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.PetDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Pet;
import com.evaluation.petshop.repository.PetRepository;

@Repository
public class PetDaoImplementation implements PetDao {
	@Autowired
	PetRepository petRepository;

<<<<<<< HEAD
	
=======
	@Override
	public List<Pet> getPetByCategory(int category) {
		List<Pet> res = petRepository.findByCategory(category);
		if (!res.isEmpty()) {
			return res;
		} else {
			throw new DataNotFoundException("Validation failed");
		}
	}
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

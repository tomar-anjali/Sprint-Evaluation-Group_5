package com.evaluation.petshop.dao.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.PetDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Pet;
import com.evaluation.petshop.repository.PetRepository;

@Repository
public class PetDaoImplementation implements PetDao {
	@Autowired
	private PetRepository petRepository;
	@Override
	public List<Pet> getAllPets() {
		return petRepository.findAll();
  }
	@Override
	public List<Pet> getPetByCategory(int category) {
		List<Pet> res = petRepository.findByCategory(category);
		if (!res.isEmpty()) {
			return res;
		} else {
			throw new DataNotFoundException("Validation failed");
		}
	}
}

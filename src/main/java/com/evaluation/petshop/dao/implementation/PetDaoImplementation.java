package com.evaluation.petshop.dao.implementation;

import java.util.List;
<<<<<<< HEAD

=======
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.PetDao;
<<<<<<< HEAD
=======
import com.evaluation.petshop.exception.DataNotFoundException;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import com.evaluation.petshop.models.entity.Pet;
import com.evaluation.petshop.repository.PetRepository;

@Repository
public class PetDaoImplementation implements PetDao {
	@Autowired
<<<<<<< HEAD
	private PetRepository petRepository;

	@Override
	public List<Pet> getAllPets() {
		return petRepository.findAll();

=======
	PetRepository petRepository;

	@Override
	public List<Pet> getPetByCategory(int category) {
		List<Pet> res = petRepository.findByCategory(category);
		if (!res.isEmpty()) {
			return res;
		} else {
			throw new DataNotFoundException("Validation failed");
		}
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
	}
}

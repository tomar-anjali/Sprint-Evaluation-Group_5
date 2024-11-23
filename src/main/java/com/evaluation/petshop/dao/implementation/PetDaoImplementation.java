package com.evaluation.petshop.dao.implementation;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;

=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
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
<<<<<<< HEAD

	@Override
	public List<Pet> getAllPets() {
		return petRepository.findAll();

	}

=======
	@Override
	public List<Pet> getAllPets() {
		return petRepository.findAll();
  }
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
	@Override
	public List<Pet> getPetByCategory(int category) {
		List<Pet> res = petRepository.findByCategory(category);
		if (!res.isEmpty()) {
			return res;
		} else {
			throw new DataNotFoundException("Validation failed");
		}
<<<<<<< HEAD
	}
	@Override
	public Pet getPetById(int petId) {
		Optional<Pet> optionalPet=petRepository.findById(petId);
		return optionalPet
				.orElseThrow(()-> new DataNotFoundException("Validation Failed"));

		
	}
	@Override
    public Pet updatePet(int petId, Pet updatedPet) {
        Optional<Pet> petOptional = petRepository.findById(petId);
        if (petOptional.isPresent()) {
            Pet pet = petOptional.get();
            // Update fields of the existing pet object with the new data
            pet.setName(updatedPet.getName());
            pet.setAge(updatedPet.getAge());
            pet.setBreed(updatedPet.getBreed());
            pet.setPrice(updatedPet.getPrice());
            pet.setDescription(updatedPet.getDescription());
            pet.setImageUrl(updatedPet.getImageUrl());
            pet.setPetCategory(updatedPet.getPetCategory());
            return petRepository.save(pet); // Save the updated pet back to the database1
        } else {
            throw new DataNotFoundException("Pet not found for update");
        }
    }
	@Override
	public Pet addNewPet(Pet pet) {
	    return petRepository.save(pet);
	}
	@Override
	public List<Pet> getPetByName(String name) {
//		System.out.println(name);
	    Optional<List<Pet>> optionalPet = petRepository.findByNameIgnoreCase(name.trim());
	   
	    List<Pet> list = optionalPet.orElseThrow(() -> new DataNotFoundException("Pet not found with name: " + name));
	    return list;
=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
	}
}

package com.evaluation.petshop.dao.implementation;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.GroomingServiceDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.GroomingService;
import com.evaluation.petshop.repository.GroomingServiceRepository;

@Repository
public class GroomingServiceDaoImplementation implements GroomingServiceDao {
	@Autowired
	private GroomingServiceRepository groomingServiceRepository;

	@Override
	public List<GroomingService> getAllGroomingServicesAvailable() {
		List<GroomingService> groomingServices=groomingServiceRepository.findAllAvailableServices();
		if(!groomingServices.isEmpty())return groomingServices;
		else throw new DataNotFoundException("Validation Failed");
	}
	

	 @Override
	  public List<GroomingService> getAllGroomingService() {
		return groomingServiceRepository.findAll();
	}

	@Override
	public GroomingService getGroomingServiceById(int serviceId) {
		Optional<GroomingService> optionalGroomingService = groomingServiceRepository.findById(serviceId);
		return optionalGroomingService.orElseThrow(() -> new DataNotFoundException("Validation failed"));
	}
	@Override
	public GroomingService updateGroomingService(int serviceId, GroomingService updatedGroomingService) {
		Optional<GroomingService> groomingServiceOptional = groomingServiceRepository.findById(serviceId);
		if (groomingServiceOptional.isPresent()) {
			GroomingService groomingService = groomingServiceOptional.get();
			groomingService.setName(updatedGroomingService.getName());
			groomingService.setDescription(updatedGroomingService.getDescription());
			groomingService.setPrice(updatedGroomingService.getPrice());
			groomingService.setAvailable(updatedGroomingService.isAvailable());

			return groomingServiceRepository.save(groomingService);
		} else {
			throw new DataNotFoundException("Grooming Service found for update");
		}
	}
	@Override
	public GroomingService addGroomingService(GroomingService groomingService) {
		return groomingServiceRepository.save(groomingService);
	}

}

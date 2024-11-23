package com.evaluation.petshop.dao;

import java.util.List;
<<<<<<< HEAD

=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
import com.evaluation.petshop.models.entity.GroomingService;


public interface GroomingServiceDao {
	List<GroomingService> getAllGroomingServicesAvailable();

	List<GroomingService> getAllGroomingService();

	GroomingService getGroomingServiceById(int serviceId);

	public GroomingService updateGroomingService(int serviceId, GroomingService groomingService);

	public GroomingService addGroomingService(GroomingService groomingService);

}

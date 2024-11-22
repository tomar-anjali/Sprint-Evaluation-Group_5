package com.evaluation.petshop.dao;

import java.util.List;
<<<<<<< HEAD

=======
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import com.evaluation.petshop.models.entity.GroomingService;

public interface GroomingServiceDao {
	List<GroomingService> getAllGroomingServicesAvailable();

	List<GroomingService> getAllGroomingService();

	GroomingService getGroomingServiceById(int serviceId);

	public GroomingService updateGroomingService(int serviceId, GroomingService groomingService);

	public GroomingService addGroomingService(GroomingService groomingService);

}

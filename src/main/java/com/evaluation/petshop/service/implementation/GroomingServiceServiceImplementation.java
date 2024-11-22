package com.evaluation.petshop.service.implementation;

import java.util.List;
import java.util.stream.Collectors;
<<<<<<< HEAD

=======
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
<<<<<<< HEAD

import com.evaluation.petshop.dao.GroomingServiceDao;
import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
=======
import com.evaluation.petshop.dao.GroomingServiceDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.GroomingServiceDto;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.GroomingService;
import com.evaluation.petshop.service.GroomingServiceService;

@Service
public class GroomingServiceServiceImplementation implements GroomingServiceService {
	@Autowired
	private GroomingServiceDao groomingServiceDao;
<<<<<<< HEAD

	@Override
	public ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingServiceAvailable() {
		List<GroomingService> groomingServices = groomingServiceDao.getAllGroomingServicesAvailable();
		List<GroomingServiceResponseDto> groomingServiceResponsedtos = groomingServices.stream()
				.filter(i -> i.isAvailable()).map(data -> {
					GroomingServiceResponseDto gro = new GroomingServiceResponseDto();
					gro.setAvailable(data.isAvailable());
					gro.setDescription(data.getDescription());
					gro.setName(data.getName());
					gro.setServiceId(data.getServiceId());
					gro.setPrice(data.getPrice());
					return gro;
				}).collect(Collectors.toList());
		ResponseStructure<List<GroomingServiceResponseDto>> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setMessage("Success");
		response.setData(groomingServiceResponsedtos);
		return new ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>>(response, HttpStatus.FOUND);
	}
=======
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

	@Override
	public ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingService() {

		List<GroomingService> groomingService = groomingServiceDao.getAllGroomingService();

		if (!groomingService.isEmpty()) {
			List<GroomingServiceResponseDto> groomingServiceResponseDto = groomingService.stream()
					.map(groomingServices -> {
						GroomingServiceResponseDto dto = new GroomingServiceResponseDto();
						dto.setServiceId(groomingServices.getServiceId());
						dto.setName(groomingServices.getName());
						dto.setDescription(groomingServices.getDescription());
						dto.setPrice(groomingServices.getPrice());
						dto.setAvailable(groomingServices.isAvailable());
						return dto;
					}).collect(Collectors.toList());

			ResponseStructure<List<GroomingServiceResponseDto>> responseStructure = new ResponseStructure<>();
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setMessage("Success");
			responseStructure.setData(groomingServiceResponseDto);

			return new ResponseEntity<>(responseStructure, HttpStatus.OK);
		} else {
			throw new DataNotFoundException("Validation failed");
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> getGroomingServiceById(int serviceId) {
		GroomingService groomingService = groomingServiceDao.getGroomingServiceById(serviceId);
		GroomingServiceResponseDto responseDto = new GroomingServiceResponseDto();
		responseDto.setServiceId(groomingService.getServiceId());
		responseDto.setName(groomingService.getName());
		responseDto.setDescription(groomingService.getDescription());
		responseDto.setPrice(groomingService.getPrice());
		responseDto.setAvailable(groomingService.isAvailable());

		ResponseStructure<GroomingServiceResponseDto> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.FOUND.value());
		responseStructure.setMessage("Grooming Service fetched by Id");
		responseStructure.setData(responseDto);

		return new ResponseEntity<ResponseStructure<GroomingServiceResponseDto>>(responseStructure, HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> updateGroomingService(int serviceId,
			GroomingServiceResponseDto groomingServiceDto) {
		GroomingService groomingService = new GroomingService();
		groomingService.setServiceId(serviceId);
		groomingService.setName(groomingServiceDto.getName());
		groomingService.setDescription(groomingServiceDto.getDescription());
		groomingService.setPrice(groomingServiceDto.getPrice());
		groomingService.setAvailable(groomingServiceDto.isAvailable());
		GroomingService grooming = groomingServiceDao.updateGroomingService(serviceId, groomingService);
		GroomingServiceResponseDto groomingServiceResponseDto2 = new GroomingServiceResponseDto();
		groomingServiceResponseDto2.setServiceId(grooming.getServiceId());
		groomingServiceResponseDto2.setName(grooming.getName());
		groomingServiceResponseDto2.setDescription(grooming.getDescription());
		groomingServiceResponseDto2.setPrice(grooming.getPrice());
		groomingServiceResponseDto2.setAvailable(grooming.isAvailable());
		ResponseStructure<GroomingServiceResponseDto> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Grooming Service updated successfully");
		responseStructure.setData(groomingServiceResponseDto2);

		return new ResponseEntity<>(responseStructure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<GroomingServiceDto>> addGroomingService(
			GroomingServiceDto groomingServiceDto) {
		// Convert DTO to Entity
		GroomingService groomingService = new GroomingService();
		groomingService.setName(groomingServiceDto.getName());
		groomingService.setDescription(groomingServiceDto.getDescription());
		groomingService.setPrice(groomingServiceDto.getPrice());
		groomingService.setAvailable(groomingServiceDto.isAvailable());
		// Save the entity using DAO
		GroomingService savedGroomingService = groomingServiceDao.addGroomingService(groomingService);
		// Convert the saved entity back to DTO
		GroomingServiceDto savedGroomingServiceDto = new GroomingServiceDto();
		savedGroomingServiceDto.setName(savedGroomingService.getName());
		savedGroomingServiceDto.setDescription(savedGroomingService.getDescription());
		savedGroomingServiceDto.setPrice(savedGroomingService.getPrice());
		savedGroomingServiceDto.setAvailable(savedGroomingService.isAvailable());
		// Prepare the response structure
		ResponseStructure<GroomingServiceDto> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Grooming service added successfully");
		responseStructure.setData(savedGroomingServiceDto);
		return new ResponseEntity<>(responseStructure, HttpStatus.CREATED);
	}
}

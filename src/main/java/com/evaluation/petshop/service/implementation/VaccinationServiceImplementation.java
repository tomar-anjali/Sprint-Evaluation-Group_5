package com.evaluation.petshop.service.implementation;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.evaluation.petshop.dao.VaccinationDao;
import com.evaluation.petshop.models.ResponseDto.VaccinationResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.VaccinationDto;
import com.evaluation.petshop.models.entity.Vaccination;
import com.evaluation.petshop.service.VaccinationService;

@Service
public class VaccinationServiceImplementation implements VaccinationService {

	@Autowired
	VaccinationDao vaccinationDao;

	@Override
	public ResponseEntity<ResponseStructure<List<VaccinationResponseDto>>> getAllVaccinations() {
		List<Vaccination> vaccinationsList = vaccinationDao.getAllVaccinations();

		List<VaccinationResponseDto> vaccinationResponseDto = vaccinationsList.parallelStream().map(data -> {
			VaccinationResponseDto vacc = new VaccinationResponseDto();
			vacc.setVaccinationId(data.getVaccinationId());
			vacc.setName(data.getName());
			vacc.setPrice(data.getPrice());
			vacc.setDescription(data.getDescription());
//			vacc.setAvailable(data.get)
			return vacc;
		}).collect(Collectors.toList());

		ResponseStructure<List<VaccinationResponseDto>> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.FOUND.value());
		responseStructure.setMessage("Found");
		responseStructure.setData(vaccinationResponseDto);
		return new ResponseEntity<ResponseStructure<List<VaccinationResponseDto>>>(responseStructure, HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<ResponseStructure<VaccinationResponseDto>> getVaccinationById(int id) {
		Vaccination vaccination = vaccinationDao.getVaccinationById(id);
		VaccinationResponseDto vaccinationDto = new VaccinationResponseDto();
		vaccinationDto.setName(vaccination.getName());
		vaccinationDto.setDescription(vaccination.getDescription());
		vaccinationDto.setPrice(vaccination.getPrice());
		vaccinationDto.setPrice(vaccination.getPrice());
		vaccinationDto.setVaccinationId(id);
		ResponseStructure<VaccinationResponseDto> res = new ResponseStructure<>();
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Found");
		res.setData(vaccinationDto);
		return new ResponseEntity<ResponseStructure<VaccinationResponseDto>>(res, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<VaccinationResponseDto>> updateVaccinationById(int id,
			VaccinationDto vaccinationDto) {
		Vaccination existingVaccination = vaccinationDao.getVaccinationById(id);

		existingVaccination.setName(vaccinationDto.getName());
		existingVaccination.setDescription(vaccinationDto.getDescription());
		existingVaccination.setPrice(vaccinationDto.getPrice());
//		existingVaccination.setAvailable(vaccinationDto.isAvailable());

		Vaccination updatedVaccination = vaccinationDao.saveVaccination(existingVaccination);

		VaccinationResponseDto responseDto = new VaccinationResponseDto();
		responseDto.setVaccinationId(updatedVaccination.getVaccinationId());
		responseDto.setName(updatedVaccination.getName());
		responseDto.setDescription(updatedVaccination.getDescription());
		responseDto.setPrice(updatedVaccination.getPrice());
		responseDto.setAvailable(updatedVaccination.isAvailable());

		ResponseStructure<VaccinationResponseDto> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Vaccination updated successfully");
		responseStructure.setData(responseDto);

		return new ResponseEntity<>(responseStructure, HttpStatus.OK);
	}
}

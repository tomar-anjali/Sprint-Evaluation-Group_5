package com.evaluation.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.petshop.models.ResponseDto.VaccinationResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.VaccinationDto;
import com.evaluation.petshop.service.VaccinationService;

@RequestMapping("/vaccinations")
@RestController
public class VaccinationController {

	@Autowired
	private VaccinationService vaccinationService;

	@GetMapping()
	public ResponseEntity<ResponseStructure<List<VaccinationResponseDto>>> getAllVaccinations() {
		return vaccinationService.getAllVaccinations();
	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<VaccinationResponseDto>> getVaccinationById(@PathVariable int id) {
		return vaccinationService.getVaccinationById(id);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseStructure<VaccinationResponseDto>> updateVaccination(@PathVariable int id,
			@RequestBody VaccinationDto vaccinationDto) {
		return vaccinationService.updateVaccinationById(id, vaccinationDto);
	}
}

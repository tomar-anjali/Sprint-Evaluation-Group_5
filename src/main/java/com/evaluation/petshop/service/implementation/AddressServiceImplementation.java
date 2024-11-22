package com.evaluation.petshop.service.implementation;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.evaluation.petshop.dao.AddressDao;
import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.CustomerDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.Address;
import com.evaluation.petshop.service.AddressService;

@Service
public class AddressServiceImplementation implements AddressService {
	@Autowired
	private AddressDao addressDao;

	@Override
	public ResponseEntity<ResponseStructure<List<AddressResponseDto>>> getAllAddressesList() {

		List<Address> addressesList = addressDao.getAllAddressesList();
		// Map Customer entities to DTOs
		List<AddressResponseDto> addressDtos = addressesList.stream().map(address -> {
			AddressResponseDto dto = new AddressResponseDto();
			dto.setStreet(address.getStreet());
			dto.setCity(address.getCity());
			dto.setState(address.getState());
			dto.setZipCode(address.getZipCode());
			return dto;
		}).collect(Collectors.toList());

		ResponseStructure<List<AddressResponseDto>> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Addresses fetched successfully");
		responseStructure.setData(addressDtos);
		return new ResponseEntity<>(responseStructure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<AddressResponseDto>> getAddressById(int addressId) {
		Address address = addressDao.getAddressById(addressId);

		AddressResponseDto addressResponseDto = new AddressResponseDto();
		addressResponseDto.setAddressId(address.getAddressId());
		addressResponseDto.setStreet(address.getStreet());
		addressResponseDto.setCity(address.getCity());
		addressResponseDto.setState(address.getState());
		addressResponseDto.setZipCode(address.getZipCode());

		ResponseStructure<AddressResponseDto> response = new ResponseStructure<>();
		response.setMessage("Success");
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setData(addressResponseDto);

		return new ResponseEntity<ResponseStructure<AddressResponseDto>>(response, HttpStatus.FOUND);

	}
}

package com.evaluation.petshop.controller;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.AddressService;

@RequestMapping("/address")
@RestController
public class AddressController {
	@Autowired
	private AddressService addressService;

<<<<<<< HEAD
	@Autowired
	 private AddressService addressService;
	@GetMapping
   public ResponseEntity<ResponseStructure<List<AddressResponseDto>>>  getAllAddressesList() {
       return  addressService.getAllAddressesList();
   }

=======
	@GetMapping("/{addressId}")
	public ResponseEntity<ResponseStructure<AddressResponseDto>> getAddressById(@PathVariable int addressId) {
		return addressService.getAddressById(addressId);
	}
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

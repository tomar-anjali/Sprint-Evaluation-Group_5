package com.evaluation.petshop.service.implementation;

<<<<<<< HEAD
import java.util.List;
import java.util.stream.Collectors;

=======
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.evaluation.petshop.dao.SupplierDao;
<<<<<<< HEAD
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.SupplierDto;
=======
import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.ResponseDto.SupplierResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import com.evaluation.petshop.models.entity.Supplier;
import com.evaluation.petshop.service.SupplierService;

@Service
public class SupplierServiceImplementation implements SupplierService {
	@Autowired
	private SupplierDao supplierDao;
<<<<<<< HEAD

	@Override
	public ResponseEntity<ResponseStructure<List<SupplierDto>>> getAllSuppliers() {
		List<Supplier> suppliers = supplierDao.getAllSuppliers();
		if (!suppliers.isEmpty()) {

			List<SupplierDto> supplierDtos = suppliers.stream().map(supplier -> {
				SupplierDto supplierDto = new SupplierDto();
				supplierDto.setName(supplier.getName());
				supplierDto.setEmail(supplier.getEmail());
				supplierDto.setPhoneNumber(supplier.getPhoneNumber());
				supplierDto.setContactPerson(supplier.getContactPerson());

				return supplierDto;
			}).collect(Collectors.toList());
			ResponseStructure<List<SupplierDto>> response = new ResponseStructure<>();
			response.setStatusCode(HttpStatus.OK.value());
			response.setMessage("Success");
			response.setData(supplierDtos);
			return new ResponseEntity<ResponseStructure<List<SupplierDto>>>(response, HttpStatus.OK);
		} else {
			throw new DataNotFoundException("Validation Failed");
		}

	}
=======
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

	@Override
	public ResponseEntity<ResponseStructure<SupplierResponseDto>> getSupplierBySupplierId(int id) {
		Supplier supplier = supplierDao.getSupplierBySupplierId(id);
		SupplierResponseDto dto = new SupplierResponseDto();
		dto.setName(supplier.getName());
		dto.setEmail(supplier.getEmail());
		dto.setContactPerson(supplier.getContactPerson());
		dto.setPhoneNumber(supplier.getPhoneNumber());
		AddressResponseDto addressResponseDto = new AddressResponseDto();
		if (supplier.getAddress() != null) {
			addressResponseDto.setAddressId(supplier.getAddress().getAddressId());
			addressResponseDto.setStreet(supplier.getAddress().getStreet());
			addressResponseDto.setCity(supplier.getAddress().getCity());
			addressResponseDto.setState(supplier.getAddress().getState());
			addressResponseDto.setZipCode(supplier.getAddress().getZipCode());
		}
		dto.setAddress(addressResponseDto);

		ResponseStructure<SupplierResponseDto> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.FOUND.value());
		responseStructure.setMessage("Data Found");
		responseStructure.setData(dto);
		return new ResponseEntity<ResponseStructure<SupplierResponseDto>>(responseStructure, HttpStatus.FOUND);
	}
}

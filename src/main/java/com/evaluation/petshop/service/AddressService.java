package com.evaluation.petshop.service;

<<<<<<< HEAD
import java.util.List;
import org.springframework.http.ResponseEntity;
=======
import org.springframework.http.ResponseEntity;

>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface AddressService {
<<<<<<< HEAD

	ResponseEntity<ResponseStructure<List<AddressResponseDto>>> getAllAddressesList();




=======
	ResponseEntity<ResponseStructure<AddressResponseDto>> getAddressById(int addressId);
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

package com.evaluation.petshop.service;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface CustomerService {
<<<<<<< HEAD
	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerByFirstAndLastName(String firstName,String lastName);
=======
	ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getAllCustomer();
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
}

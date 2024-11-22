package com.evaluation.petshop.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.evaluation.petshop.dao.TransactionDao;
import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.ResponseDto.PetCategoryResponseDto;
import com.evaluation.petshop.models.ResponseDto.PetResponseDto;
import com.evaluation.petshop.models.ResponseDto.TransactionResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.Transaction;
import com.evaluation.petshop.service.TransactionService;

@Service
public class TransactionServiceImplementation implements TransactionService {
	@Autowired
	private TransactionDao transactionDao;
	@Override
	public ResponseEntity<ResponseStructure<List<TransactionResponseDto>>> getAllTransactionList() {
		List<Transaction> list = transactionDao.getAllTransactionList();
		List<TransactionResponseDto> transactionResponseDtos = list.stream().map(data -> {
			CustomerResponseDto customerResponseDto = new CustomerResponseDto();
			if (data.getCustomer() != null) {
				customerResponseDto.setFirstName(data.getCustomer().getFirstName());
				customerResponseDto.setLastName(data.getCustomer().getLastName());
				customerResponseDto.setEmail(data.getCustomer().getEmail());
				customerResponseDto.setPhoneNumber(data.getCustomer().getPhoneNumber());
				AddressResponseDto addressResponseDto = new AddressResponseDto();
				if (data.getCustomer().getAddress() != null) {
					addressResponseDto.setAddressId(data.getCustomer().getAddress().getAddressId());
					addressResponseDto.setStreet(data.getCustomer().getAddress().getStreet());
					addressResponseDto.setCity(data.getCustomer().getAddress().getCity());
					addressResponseDto.setState(data.getCustomer().getAddress().getState());
					addressResponseDto.setZipCode(data.getCustomer().getAddress().getZipCode());
				}
				customerResponseDto.setAddress(addressResponseDto);
			}
			PetResponseDto petResponseDto = new PetResponseDto();
			if (data.getPet() != null) {
				petResponseDto.setPetId(data.getPet().getPetId());
				petResponseDto.setName(data.getPet().getName());
				petResponseDto.setAge(data.getPet().getAge());
				petResponseDto.setBreed(data.getPet().getBreed());
				petResponseDto.setDescription(data.getPet().getDescription());
				petResponseDto.setPrice(data.getPet().getPrice());
				petResponseDto.setImageUrl(data.getPet().getImageUrl());

				PetCategoryResponseDto categoryResponseDto = new PetCategoryResponseDto();
				if (data.getPet().getPetCategory() != null) {
					categoryResponseDto.setCategoryId(data.getPet().getPetCategory().getCategoryId());
					categoryResponseDto.setName(data.getPet().getPetCategory().getName());
				}
				petResponseDto.setPetCategory(categoryResponseDto);
			}
			TransactionResponseDto transactionResponseDto = new TransactionResponseDto();
			transactionResponseDto.setAmount(data.getAmount());
			transactionResponseDto.setTransactionStatus(data.getTransactionStatus());
			transactionResponseDto.setTransactionDate(data.getTransactionDate());
			transactionResponseDto.setPet(petResponseDto);
			transactionResponseDto.setCustomer(customerResponseDto);

			return transactionResponseDto;
		}).collect(Collectors.toList());
		ResponseStructure<List<TransactionResponseDto>> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.FOUND.value());
		responseStructure.setMessage("Found");
		responseStructure.setData(transactionResponseDtos);
		return new ResponseEntity<ResponseStructure<List<TransactionResponseDto>>>(responseStructure, HttpStatus.FOUND);
	}
}

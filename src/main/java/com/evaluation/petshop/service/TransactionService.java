package com.evaluation.petshop.service;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.TransactionResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface TransactionService {
	ResponseEntity<ResponseStructure<TransactionResponseDto>> getTransactionById(int transactionId);

}

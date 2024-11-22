package com.evaluation.petshop.service;

<<<<<<< HEAD
import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.TransactionResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface TransactionService {
	ResponseEntity<ResponseStructure<TransactionResponseDto>> getTransactionById(int transactionId);
=======
import java.util.List;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.TransactionResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface TransactionService {
	ResponseEntity<ResponseStructure<List<TransactionResponseDto>>> getAllTransactionList();
}

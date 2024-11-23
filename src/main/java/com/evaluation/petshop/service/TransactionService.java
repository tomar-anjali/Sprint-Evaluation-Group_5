package com.evaluation.petshop.service;

<<<<<<< HEAD
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.TransactionResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface TransactionService {
	ResponseEntity<ResponseStructure<List<TransactionResponseDto>>> getAllTransactionList();

	ResponseEntity<ResponseStructure<TransactionResponseDto>> getTransactionById(int transactionId);
=======
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.TransactionResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import java.util.List;

public interface TransactionService {
	ResponseEntity<ResponseStructure<List<TransactionResponseDto>>> getAllTransactionList();
  ResponseEntity<ResponseStructure<TransactionResponseDto>> getTransactionById(int transactionId);
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
}

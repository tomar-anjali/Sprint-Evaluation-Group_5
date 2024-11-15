package com.evaluation.petshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.evaluation.petshop.models.dto.ResponseStructure;

@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler{
	public ResponseEntity<ResponseStructure<String>> dataNotFoundHandler(DataNotFoundException dataNotFoundException){
		ResponseStructure<String> responseStructure=new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage(dataNotFoundException.getMessage());
		responseStructure.setData("Data Not Found");
		
		
		return new ResponseEntity<>(responseStructure,HttpStatus.NOT_FOUND);
		
	}
}

package com.evaluation.petshop.exception;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
<<<<<<< HEAD
public class GlobalException extends ResponseEntityExceptionHandler{
	public ResponseEntity<ResponseStructure<String>> dataNotFoundHandler(DataNotFoundException dataNotFoundException){
		ResponseStructure<String> responseStructure=new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage(dataNotFoundException.getMessage());
		responseStructure.setData("Data Not Found");
		
		
		return new ResponseEntity<>(responseStructure,HttpStatus.NOT_FOUND);
		
=======
public class GlobalException extends ResponseEntityExceptionHandler {
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFound(DataNotFoundException dataNotFoundException) {
		Map<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", dataNotFoundException.getMessage());
		return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
>>>>>>> 14700b7f7a9fbabc59f765ca5d84570163f8f617
	}
}

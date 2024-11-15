package com.evaluation.petshop.models.dto;

import lombok.Data;


@Data
public class ResponseStructure<T> {
	private int statusCode;
	private String message;
	private T data;
}

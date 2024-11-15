package com.evaluation.petshop.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data

public class ResponseStructure<T> {
	private int statusCode;
	private String message;
	private T data;
}

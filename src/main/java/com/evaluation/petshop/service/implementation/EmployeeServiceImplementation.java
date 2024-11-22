package com.evaluation.petshop.service.implementation;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.evaluation.petshop.dao.EmployeeDao;
import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.ResponseDto.EmployeeResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.Employee;
import com.evaluation.petshop.service.EmployeeService;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public ResponseEntity<ResponseStructure<List<EmployeeResponseDto>>> getAllEmployees() {
		List<Employee> employee = employeeDao.getAllEmployees();
		
		
			List<EmployeeResponseDto> employeeDto = employee.stream().map(employees -> {
				AddressResponseDto addressResponseDto = new AddressResponseDto();
				if(employees.getAddress() != null) {
					addressResponseDto.setAddressId(employees.getAddress().getAddressId());
					addressResponseDto.setStreet(employees.getAddress().getStreet());
					addressResponseDto.setCity(employees.getAddress().getCity());
					addressResponseDto.setState(employees.getAddress().getState());
					addressResponseDto.setZipCode(employees.getAddress().getZipCode());
				}
				EmployeeResponseDto dto = new EmployeeResponseDto();
				dto.setEmployeeId(employees.getEmployeeId());
				dto.setFirstName(employees.getFirstName());
				dto.setLastName(employees.getLastName());
				dto.setPosition(employees.getPosition());
				dto.setPhoneNumber(employees.getPhoneNumber());
				dto.setEmail(employees.getEmail());
				dto.setHireDate(employees.getHireDate());
				dto.setAddress(addressResponseDto);
				
				return dto;
				
			}).collect(Collectors.toList());
			
			ResponseStructure<List<EmployeeResponseDto>> response = new ResponseStructure<>();
			response.setStatusCode(HttpStatus.FOUND.value());
			response.setMessage("Success");
			response.setData(employeeDto);
				
			return new ResponseEntity<>(response, HttpStatus.FOUND);
				
	}

}

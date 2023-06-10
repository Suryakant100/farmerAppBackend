package com.farmerapp.complaints;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.farmerapp.supplier.DealerNotFoundException;

@RestControllerAdvice
public class ComplaintsExceptionHandler {
	@ExceptionHandler(DealerNotFoundException.class)
	public ResponseEntity<?> handleDealerNotFound(DealerNotFoundException ex) {
		Map<String, Object> errors = new LinkedHashMap<>();

		errors.put("error", "Not a Valid Dealer EmailId");
		errors.put("message", ex.getMessage());
		errors.put("timestamp", LocalDate.now());

		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}
}

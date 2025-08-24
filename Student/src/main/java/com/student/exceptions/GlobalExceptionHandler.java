package com.student.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.student.payload.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException ex) {
       return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), false),HttpStatus.BAD_REQUEST);
    }
	
	
	
}

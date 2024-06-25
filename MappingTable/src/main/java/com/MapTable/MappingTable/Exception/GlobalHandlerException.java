package com.MapTable.MappingTable.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalHandlerException 
{
	@ExceptionHandler(EmployeeNotFoundException.class)
   public ResponseEntity<EmployeeErrorDetails> handleemployeeexception(EmployeeNotFoundException message,WebRequest path)
   {
EmployeeErrorDetails error=new EmployeeErrorDetails(new Date(),message.getMessage(),path.getDescription(false));
	   
	   return new  ResponseEntity<>(error,HttpStatus.OK);
   }
}

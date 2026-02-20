package com.myproject.microservicesproject.error;

import com.myproject.microservicesproject.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { EmployeeNotFoundException.class })
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage employeeNotFoundler(EmployeeNotFoundException employeeNotFoundException){
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND, employeeNotFoundException.getMessage());
        return errorMessage;
    }
}

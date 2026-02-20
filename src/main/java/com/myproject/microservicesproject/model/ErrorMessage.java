package com.myproject.microservicesproject.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorMessage {

    private HttpStatus status;
    private String message;
    public ErrorMessage() {

    }
    public ErrorMessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}

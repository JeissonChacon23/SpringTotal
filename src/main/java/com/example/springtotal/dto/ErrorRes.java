package com.example.springtotal.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class ErrorRes {
    HttpStatus httpStatus;
    String message;
    public ErrorRes(HttpStatus httpStatus, String message){
        this.httpStatus = httpStatus;
        this.message = message;
    }
}

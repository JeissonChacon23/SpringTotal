package com.example.springtotal.dto;

import lombok.Data;

@Data
public class LogInRequest {
    private String email;
    private String password;
    public LogInRequest(String email, String password){
        this.email = email;
        this.password = password;
    }
}

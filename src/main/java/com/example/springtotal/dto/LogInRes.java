package com.example.springtotal.dto;

import lombok.Data;

@Data
public class LogInRes {
    private String email;
    private String token;

    public LogInRes(String email, String token){
        this.email = email;
        this.token = token;
    }
}

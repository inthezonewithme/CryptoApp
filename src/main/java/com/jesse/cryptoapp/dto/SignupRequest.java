package com.jesse.cryptoapp.dto;


import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String password;
    private String fullName;
}

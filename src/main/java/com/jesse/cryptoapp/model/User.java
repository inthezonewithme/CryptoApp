package com.jesse.cryptoapp.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.jesse.cryptoapp.domain.USER_R0LE;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)//this enables Json being returned from revealing this field
    private String password;

    private USER_R0LE role = USER_R0LE.ROLE_CUSTOMER;

    @Embedded
    private TwoFactorAuth twoFactorAuth = new TwoFactorAuth();
}

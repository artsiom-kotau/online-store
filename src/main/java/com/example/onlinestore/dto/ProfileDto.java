package com.example.onlinestore.dto;

import lombok.Data;

import java.util.Set;

@Data
public class ProfileDto {
    private Long id;
    private UserDto user;
    private String firstName;
    private String lastName;
    private Set<PaymentMethodDto> paymentsMethods;
}

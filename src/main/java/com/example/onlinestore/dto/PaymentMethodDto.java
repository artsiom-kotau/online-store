package com.example.onlinestore.dto;

import lombok.Data;

@Data
public class PaymentMethodDto {
    private Long id;
    private ProfileDto profile;
    private String nameOfMethod;
}

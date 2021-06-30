package com.example.onlinestore.service;

import com.example.onlinestore.dto.PaymentMethodDto;

public interface PaymentMethodService {
    PaymentMethodDto getPaymentMethodById(Long id);

    void savePaymentMethod(PaymentMethodDto paymentMethodDto);

}

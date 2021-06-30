package com.example.onlinestore.service.impl;

import com.example.onlinestore.domain.PaymentMethod;
import com.example.onlinestore.dto.PaymentMethodDto;
import com.example.onlinestore.mapper.PaymentMethodMapper;
import com.example.onlinestore.repository.PaymentMethodRepository;
import com.example.onlinestore.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PaymentMethodServiceImpl implements PaymentMethodService {

    @Autowired
    private PaymentMethodMapper mapper;

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @Override
    public PaymentMethodDto getPaymentMethodById(Long id) {
        PaymentMethodDto paymentMethodDto = new PaymentMethodDto();
        return paymentMethodDto;
    }

    @Transactional
    @Override
    public void savePaymentMethod(PaymentMethodDto paymentMethodDto) {
        PaymentMethod paymentMethod = mapper.mapPaymentMethodDtoToPaymentMethod(paymentMethodDto);
        paymentMethodRepository.save(paymentMethod);

    }


}

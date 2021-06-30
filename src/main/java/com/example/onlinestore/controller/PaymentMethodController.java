package com.example.onlinestore.controller;

import com.example.onlinestore.dto.PaymentMethodDto;
import com.example.onlinestore.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paymentMethod")
public class PaymentMethodController {

    @Autowired
    private PaymentMethodService paymentMethodService;

    @GetMapping("/{id}")
    public PaymentMethodDto getOneById(@PathVariable Long id) {
        return paymentMethodService.getPaymentMethodById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateById(@RequestBody PaymentMethodDto paymentMethodDto) {
       paymentMethodService.savePaymentMethod(paymentMethodDto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/registration")
    public ResponseEntity register(@RequestBody PaymentMethodDto paymentMethodDto) {
        paymentMethodService.savePaymentMethod(paymentMethodDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}

package com.example.onlinestore.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
public class TransactionDto {
    private Long id;
    private Date date;
    private BigDecimal price;
    private GoodDto good;
    private PaymentMethodDto paymentMethod;
    private Set<BucketGoodDto> bucketGoods;
}

package com.example.onlinestore.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BucketGoodDto {
    private Long id;
    private Integer numberOfGoods;
    private BigDecimal price;
    private BucketDto bucket;
    private GoodDto good;
    private TransactionDto transactionDto;
}

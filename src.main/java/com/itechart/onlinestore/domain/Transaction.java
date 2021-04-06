package com.itechart.onlinestore.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Transaction {
    private UUID id;

    private Date date;

    private BigDecimal price;

    private Good good;

    private PaymentMethod paymentMethod;
}

package com.itechart.onlinestore.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PaymentMethod {
    private UUID id;

    private Profile profile;

    private Set<Transaction> transactions = new HashSet<Transaction>();
}

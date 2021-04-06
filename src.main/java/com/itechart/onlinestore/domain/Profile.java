package com.itechart.onlinestore.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Profile {
    private UUID id;

    private User user;

    private Set<PaymentMethod> paymentsMathods = new HashSet<PaymentMethod>();
}

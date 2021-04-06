package com.itechart.onlinestore.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Good {
    private UUID id;

    private Bucket bucket;

    private Set<Category> categories = new HashSet<Category>();

    private Set<Transaction> transactions = new HashSet<Transaction>();
}

package com.itechart.onlinestore.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Bucket {
    private UUID id;

    private User user;

    private Set<Good> goods = new HashSet<Good>();
}

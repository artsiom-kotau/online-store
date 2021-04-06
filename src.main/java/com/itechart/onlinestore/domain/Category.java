package com.itechart.onlinestore.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Category {
    private UUID id;

    private String name;

    private Set<Good> goods = new HashSet<Good>();
}

package com.example.onlinestore.domain;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIES")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private Good good;

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

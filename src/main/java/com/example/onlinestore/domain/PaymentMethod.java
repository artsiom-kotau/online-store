package com.example.onlinestore.domain;


import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_METHODS")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Profile profile;

    private String name;

    public PaymentMethod() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}

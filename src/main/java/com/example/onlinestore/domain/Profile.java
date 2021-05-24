package com.example.onlinestore.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PROFILES")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @OneToMany(mappedBy = "profile")
    private Set<PaymentMethod> paymentsMethods;

    private String firstName;

    private String lastName;

    public Profile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<PaymentMethod> getPaymentsMethods() {
        return paymentsMethods;
    }

    public void setPaymentsMethods(Set<PaymentMethod> paymentsMethods) {
        this.paymentsMethods = paymentsMethods;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}

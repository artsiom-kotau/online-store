package com.example.onlinestore.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="PROFILES")
public class Profile {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy="profile")
    private Set<PaymentMethod> paymentsMathods;

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

    public Set<PaymentMethod> getPaymentsMathods() {
        return paymentsMathods;
    }

    public void setPaymentsMathods(Set<PaymentMethod> paymentsMathods) {
        this.paymentsMathods = paymentsMathods;
    }
}

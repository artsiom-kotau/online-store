package com.example.onlinestore.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "TRANSACTIONS")
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Date date;

    private BigDecimal price;

    @ManyToOne
    private Good good;

    @ManyToOne
    private PaymentMethod paymentMethod;

    @OneToMany(mappedBy = "transaction")
    private Set<BucketGood> bucketGoods;

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Set<BucketGood> getBucketGoods() {
        return bucketGoods;
    }

    public void setBucketGoods(Set<BucketGood> bucketGoods) {
        this.bucketGoods = bucketGoods;
    }
}

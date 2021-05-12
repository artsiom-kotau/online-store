package com.example.onlinestore.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="BUCKET_GOODS")
public class BucketGood {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Integer numberOfGoods;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name="bucket_id", nullable=false)
    private Bucket bucket;

    @ManyToOne
    @JoinColumn(name="good_id", nullable=false)
    private Good good;

    public BucketGood() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(Integer numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Bucket getBucket() {
        return bucket;
    }

    public void setBucket(Bucket bucket) {
        this.bucket = bucket;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }
}

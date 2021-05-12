package com.example.onlinestore.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="BUCKETS")
public class Bucket {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private User user;

    @OneToMany(mappedBy="bucket")
    private Set<BucketGood> bucketGoods;

    public Bucket() {
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

    public Set<BucketGood> getBucketGoods() {
        return bucketGoods;
    }

    public void setBucketGoods(Set<BucketGood> bucketGoods) {
        this.bucketGoods = bucketGoods;
    }
}

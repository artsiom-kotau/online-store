package com.example.onlinestore.dto;

import lombok.Data;

import java.util.Set;

@Data
public class BucketDto {
    private Long id;
    private UserDto user;
    private Set<BucketGoodDto> bucketGoods;
}

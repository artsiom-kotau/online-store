package com.example.onlinestore.dto;

import lombok.Data;

@Data
public class GoodDto {
    private Long id;
    private String name;
    private String country;
    private CategoryDto category;
}

package com.example.onlinestore.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private ProfileDto profile;
    private BucketDto bucket;
    private String username;
    private String email;
}

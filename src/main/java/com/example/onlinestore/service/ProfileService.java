package com.example.onlinestore.service;

import com.example.onlinestore.dto.ProfileDto;

public interface ProfileService {

    ProfileDto getProfileById(Long id);

    void saveProfile(ProfileDto profileDto);
}

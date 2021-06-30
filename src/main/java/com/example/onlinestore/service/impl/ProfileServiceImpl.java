package com.example.onlinestore.service.impl;

import com.example.onlinestore.domain.Profile;
import com.example.onlinestore.dto.ProfileDto;
import com.example.onlinestore.mapper.ProfileMapper;
import com.example.onlinestore.repository.ProfileRepository;
import com.example.onlinestore.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileMapper mapper;

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public ProfileDto getProfileById(Long id) {
        return null;
    }

    @Transactional
    @Override
    public void saveProfile(ProfileDto profileDto) {
        Profile profile = mapper.mapProfileDtoToProfile(profileDto);
        profileRepository.save(profile);
    }
}

package com.example.onlinestore.mapper;

import com.example.onlinestore.domain.Profile;
import com.example.onlinestore.dto.ProfileDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ProfileMapper {
    public abstract ProfileDto mapProfileToProfileDto(Profile profile);

    public abstract Profile mapProfileDtoToProfile(ProfileDto profileDto);
}

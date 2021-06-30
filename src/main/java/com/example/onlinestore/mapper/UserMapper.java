package com.example.onlinestore.mapper;

import com.example.onlinestore.domain.User;
import com.example.onlinestore.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class UserMapper {
    public abstract UserDto mapUserToUserDto(User user);

    public abstract User mapUserDtoToUser(UserDto userDto);
}

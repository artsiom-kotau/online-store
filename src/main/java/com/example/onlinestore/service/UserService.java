package com.example.onlinestore.service;

import com.example.onlinestore.dto.UserDto;

public interface UserService {

    UserDto getUserById(Long id);

    void saveUser(UserDto userDto);

   void deleteUser(Long id);
}

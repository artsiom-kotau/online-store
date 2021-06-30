package com.example.onlinestore.service.impl;

import com.example.onlinestore.domain.User;
import com.example.onlinestore.dto.UserDto;
import com.example.onlinestore.mapper.UserMapper;
import com.example.onlinestore.repository.UserRepository;
import com.example.onlinestore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto getUserById(Long id) {
        return null;
    }

    @Transactional
    @Override
    public void saveUser(UserDto userDto) {
        User user = mapper.mapUserDtoToUser(userDto);
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
         userRepository.deleteById(id);
    }
}

package com.epam.learning.service.impl;

import com.epam.learning.dto.UserDto;
import com.epam.learning.entity.UserEntity;
import com.epam.learning.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Override
    public UserDto createUser(UserDto userDto) {

        return userDto;
    }

    @Override
    public UserDto updateUser(Integer id, UserDto userDto) {

        return userDto;
    }

    @Override
    public String deleteUser(Integer id) {

        return "User was deleted successfully";
    }

    @Override
    public UserEntity getUserEntity(Integer id) {

        return new UserEntity();
    }

}

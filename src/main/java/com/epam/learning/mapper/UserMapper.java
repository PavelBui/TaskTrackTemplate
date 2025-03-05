package com.epam.learning.mapper;

import com.epam.learning.dto.UserDto;
import com.epam.learning.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity dtoToEntity(UserDto userDto) {

        return new UserEntity();
    }

    public UserDto entityToDto(UserEntity userEntity) {

        return UserDto.builder()
                .build();
    }
}

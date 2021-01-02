package com.spring.appuser.service.implementation;

import com.spring.appuser.dto.UserDto;
import com.spring.appuser.service.UsersService;

import java.util.UUID;

/*
 *Created by olga on 02.01.2021
 */
public class UsersServiceImpl implements UsersService {
    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
    return null;
    }
}

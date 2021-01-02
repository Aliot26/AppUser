package com.spring.appuser.service;

import com.spring.appuser.dto.UserDto;
import org.springframework.stereotype.Service;

/*
 *Created by olga on 02.01.2021
 */
public interface UsersService {
    UserDto createUser(UserDto userDetails);
}

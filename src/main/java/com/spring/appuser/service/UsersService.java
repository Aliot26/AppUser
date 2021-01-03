package com.spring.appuser.service;

import com.spring.appuser.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/*
 *Created by olga on 02.01.2021
 */
public interface UsersService extends UserDetailsService {
    UserDto createUser(UserDto userDetails);
    UserDto getUsersDetailsByEmail(String email);
}

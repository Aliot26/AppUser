package com.spring.appuser.service.implementation;

import com.spring.appuser.dto.UserDto;
import com.spring.appuser.model.UserEntity;
import com.spring.appuser.repository.UserRepository;
import com.spring.appuser.service.UsersService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/*
 *Created by olga on 02.01.2021
 */
@Service
public class UsersServiceImpl implements UsersService {
    UserRepository userRepository;

    @Autowired
    public UsersServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);

        userEntity.setEncryptedPassword("test");

        userRepository.save(userEntity);
    return null;
    }
}

package com.spring.appuser.controller;

import com.spring.appuser.dto.CreateUserRequestModel;
import com.spring.appuser.dto.CreateUserResponseModel;
import com.spring.appuser.dto.UserDto;
import com.spring.appuser.service.UsersService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/*
 *Created by olga on 29.12.2020
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private Environment env;

    UsersService usersService;

    public UserController(Environment env, UsersService usersService) {
        this.env = env;
        this.usersService = usersService;
    }

    @GetMapping("/status/check")
    public String status(){
        return "It's working on port " + env.getProperty("local.server.port");
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<CreateUserResponseModel> createUser(@Valid @RequestBody CreateUserRequestModel usersDetails){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = modelMapper.map(usersDetails, UserDto.class);
        UserDto createdUser = usersService.createUser(userDto);
        CreateUserResponseModel returnValue = modelMapper.map(createdUser, CreateUserResponseModel.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(returnValue) ;
    }
}

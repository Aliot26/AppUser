package com.spring.appuser.dto;

import lombok.Getter;
import lombok.Setter;

/*
 *Created by olga on 03.01.2021
 */
@Getter
@Setter
public class CreateUserResponseModel {
    private String firstName;
    private String lastName;
    private String email;
    private String userId;
}

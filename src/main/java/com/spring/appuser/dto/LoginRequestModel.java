package com.spring.appuser.dto;

import lombok.Getter;
import lombok.Setter;

/*
 *Created by olga on 03.01.2021
 */
@Getter
@Setter
public class LoginRequestModel {
    private String email;
    private String password;
}

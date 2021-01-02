package com.spring.appuser.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/*
 *Created by olga on 02.01.2021
 */
@Setter
@Getter
public class UserDto implements Serializable {
    private static final long serialVersionUID = -6533595767104376559L;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String userId;
    private String encryptedPassword;
}

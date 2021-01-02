package com.spring.appuser.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 *Created by olga on 02.01.2021
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequestModel {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}

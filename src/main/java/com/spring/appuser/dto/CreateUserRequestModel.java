package com.spring.appuser.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 *Created by olga on 02.01.2021
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequestModel {

    @NotNull(message = "Firstname can not be null")
    @Size(min = 2, max = 10, message = "Firstname must be equal or more than 2 characters and less than 10")
    private String firstName;

    @NotNull(message = "Lastname can not be null")
    @Size(min = 2, max = 10, message = "Lastname must be equal or more than 2 characters and less than 10")
    private String lastName;

    @NotNull(message = "Password can not be null")
    @Size(min = 3, max = 10, message = "Password must be equal or more than 3 characters and less than 10")
    private String password;

    @NotNull(message = "Email can not be null")
    @Email
    private String email;
}

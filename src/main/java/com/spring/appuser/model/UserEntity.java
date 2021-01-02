package com.spring.appuser.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/*
 *Created by olga on 02.01.2021
 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity implements Serializable {
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = -1507763884717318373L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String userId;

    @Column(nullable = false, unique = true)
    private String encryptedPassword;
}

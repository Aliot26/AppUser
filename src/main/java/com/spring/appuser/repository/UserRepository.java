package com.spring.appuser.repository;

import com.spring.appuser.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 *Created by olga on 02.01.2021
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}


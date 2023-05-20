package com.authorization.spring.authorization.service;

import com.authorization.spring.authorization.repository.UserRepository;
import com.authorization.spring.authorization.model.UserEntity;
import org.aspectj.weaver.loadtime.definition.LightXMLParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserEntity addUser(UserEntity userEntity) {
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
        return repository.save(userEntity);
    }

    public List<UserEntity> getAll(){
        return repository.findAll();
    }

}

package com.authorization.spring.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.authorization.spring.authorization.model.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    Optional<UserEntity> findByEmailIgnoreCase(String email);
}

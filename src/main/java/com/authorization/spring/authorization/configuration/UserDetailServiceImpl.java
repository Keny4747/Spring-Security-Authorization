package com.authorization.spring.authorization.configuration;

import com.authorization.spring.authorization.repository.UserRepository;
import com.authorization.spring.authorization.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private  UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<UserEntity> user = userRepository.findByEmailIgnoreCase(email);

        return user.map(UserEntityUserDetails::new)
                .orElseThrow(()->new UsernameNotFoundException("email not found "+email));
    }
}

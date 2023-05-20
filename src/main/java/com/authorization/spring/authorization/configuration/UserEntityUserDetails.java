package com.authorization.spring.authorization.configuration;

import com.authorization.spring.authorization.model.Role;
import com.authorization.spring.authorization.model.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserEntityUserDetails implements UserDetails {

    private String name;
    private String password;
    private Role role;

    public UserEntityUserDetails(UserEntity userEntity) {
        this.name = userEntity.getEmail();
        this.password = userEntity.getPassword();
        this.role = userEntity.getRole();

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.getAuthorities();

    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

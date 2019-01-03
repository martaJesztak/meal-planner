package com.mealplanner.app.service;

import com.mealplanner.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class MongoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.mealplanner.app.model.User user = repository.findUserByEmail(username);
        if(user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(),
                isAdmin(username)? Collections.singletonList(new SimpleGrantedAuthority("USER_LIST")) : Collections.emptyList());
    }

    private boolean isAdmin(String username) {
        if(username.equals("ADMIN")) {
            return true;
        }
        return false;
    }
}

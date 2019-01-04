package com.mealplanner.app.service;

import com.mealplanner.app.model.Recipe;
import com.mealplanner.app.model.User;
import com.mealplanner.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    List<Recipe> getAllRecipes(String userId) {
        return userRepository.findOneById(userId).getRecipes();
    }

    public void save(User user) {
        user.setPassword(passwordEncoder().encode(user.getPassword()));
        userRepository.save(user);
    }
}

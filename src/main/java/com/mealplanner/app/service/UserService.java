package com.mealplanner.app.service;

import com.mealplanner.app.model.Recipe;
import com.mealplanner.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    List<Recipe> getAllRecipes(String userId) {
        return userRepository.findOneById(userId).getRecipes();
    }
}

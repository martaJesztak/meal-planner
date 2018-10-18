package com.mealplanner.app.service;

import com.mealplanner.app.model.Recipe;
import com.mealplanner.app.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public void createRecipe(){

    }

    public Recipe getOwnRecipe(int id){
        return recipeRepository.findOneById(id);
    }
}

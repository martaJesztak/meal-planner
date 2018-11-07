package com.mealplanner.app.service;

import com.mealplanner.app.model.Recipe;
import com.mealplanner.app.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public void createRecipe(Recipe recipe){
        recipeRepository.save(recipe);
    }

    public Recipe getOwnRecipe(String id){
        return recipeRepository.findOneById(id);
    }

    public List<Recipe> getAllRecipes() {return recipeRepository.findAll();}


}

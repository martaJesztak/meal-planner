package com.mealplanner.app.controller;

import com.mealplanner.app.model.Recipe;
import com.mealplanner.app.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create (@RequestBody Recipe recipe) {
        recipeService.createRecipe(recipe);
    }

    @GetMapping(value = "/{id}")
    public Recipe read(@PathVariable String id) {
        return recipeService.getOwnRecipe(id);
    }




}

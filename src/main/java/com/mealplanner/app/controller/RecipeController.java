package com.mealplanner.app.controller;

import com.mealplanner.app.model.Recipe;
import com.mealplanner.app.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @PostMapping
    public String create (@ModelAttribute Recipe recipe) {
        recipeService.createRecipe(recipe);
        return "redirect:/";
    }

    @GetMapping(value = "/{id}")
    public Recipe read(@PathVariable String id) {
        return recipeService.getOwnRecipe(id);
    }

}

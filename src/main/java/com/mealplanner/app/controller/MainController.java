package com.mealplanner.app.controller;

import com.mealplanner.app.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    RecipeService recipeService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("recipes",recipeService.getAllRecipes());
        return "index";
    }

    @GetMapping("/recipeform")
    public String recipeForm(){
        return "recipeForm";
    }

    @GetMapping("/recipemanager")
    public String recipeManager(){
        return "recipeManager";
    }

    @GetMapping("/mealplan")
    public String mealPlan(){
        return "mealplan";
    }


}

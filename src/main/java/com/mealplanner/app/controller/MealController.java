package com.mealplanner.app.controller;

import com.mealplanner.app.model.MealPlan;
import com.mealplanner.app.service.MealPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mealplanner")
public class MealController {

    @Autowired
    MealPlanService mealPlanService;

    @PostMapping
    public String create (@ModelAttribute MealPlan mealPlan, Model model) {
        MealPlan randomMealPlan = mealPlanService.generateRandomMealPlan(mealPlan.getNumberOfDays());
        model.addAttribute("recipes", randomMealPlan.getRecipes());
        return "redirect:/mealplanlist";
    }
}

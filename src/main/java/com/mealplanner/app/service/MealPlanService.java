package com.mealplanner.app.service;

import com.mealplanner.app.model.MealPlan;
import com.mealplanner.app.model.Recipe;
import com.mealplanner.app.repository.MealPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
public class MealPlanService {

    @Autowired
    private MealPlanRepository mealPlanRepository;

    @Autowired UserService userService;

    public MealPlan getMealPlan(String id) {
        return mealPlanRepository.findOneById(id);
    }

    public void saveMealPlan(MealPlan mealPlan) {
        mealPlanRepository.save(mealPlan);
    }

    public ResponseEntity.BodyBuilder deleteMealPlan(String id) {
        mealPlanRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED);
    }

    public ResponseEntity.BodyBuilder editMealPlan(String id) {
        mealPlanRepository.save(mealPlanRepository.findOneById(id));
        return ResponseEntity.status(HttpStatus.ACCEPTED);
    }

    public MealPlan generateRandomMealPlan(String userId, int numberOfDays) {
        final List<Recipe> userRecipes = userService.getAllRecipes(userId);
        Random randomiser = new Random();
        Recipe[] recipes = new Recipe[numberOfDays];

        for (int i = 0; i<=numberOfDays; i++) {
            int listIndex = randomiser.nextInt(userRecipes.size());
            recipes[i] = userRecipes.get(listIndex);
            userRecipes.remove(listIndex);
        }
        MealPlan randomMealPlan = new MealPlan();
        randomMealPlan.setRecipes(recipes);

        return randomMealPlan;
    }

    // TODO
//     create meal plan by Recipes' ids.

}

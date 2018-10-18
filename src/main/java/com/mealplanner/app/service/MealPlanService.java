package com.mealplanner.app.service;

import com.mealplanner.app.model.MealPlan;
import com.mealplanner.app.repository.MealPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class MealPlanService {

    @Autowired
    private MealPlanRepository mealPlanRepository;

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
}

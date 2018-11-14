package com.mealplanner.app.repository;

import com.mealplanner.app.model.MealPlan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MealPlanRepository extends MongoRepository<MealPlan, String> {

    MealPlan findOneById(String id);
}

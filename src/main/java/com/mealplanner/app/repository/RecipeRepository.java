package com.mealplanner.app.repository;

import com.mealplanner.app.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {

    Recipe findOneById(String id);
}

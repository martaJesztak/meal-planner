package com.mealplanner.app.repository;

import com.mealplanner.app.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findOneById(String id);

    User findUserByEmail(String email);
}
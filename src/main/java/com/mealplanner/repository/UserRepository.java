package com.mealplanner.repository;


import com.mealplanner.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

    User findOneByName(String name);

    User findOneById(String id);

}

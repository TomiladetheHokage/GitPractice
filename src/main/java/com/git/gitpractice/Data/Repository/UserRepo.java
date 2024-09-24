package com.git.gitpractice.Data.Repository;

import com.git.gitpractice.Data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {

}

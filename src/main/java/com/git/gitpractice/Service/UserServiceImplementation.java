package com.git.gitpractice.Service;

import com.git.gitpractice.Data.Repository.UserRepo;
import com.git.gitpractice.Data.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    private UserRepo userRepo;

    @Override
    public User signUp(String username, String password) {
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        userRepo.save(user);
        return user;
    }
}

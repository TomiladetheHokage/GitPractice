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

    @Override
    public String login(String usernmae, String password) {
        User user = new User();
        if(usernmae.equals(user.getName()) && password.equals(user.getPassword())){
            return "login";
        }

        return usernmae;
    }

    @Override

    public String dance(String name){
        return name + "is dance";
    }
    @Override
    public String swim(String name){
        return name + " csn swim";
    }

    @Override
    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }





}

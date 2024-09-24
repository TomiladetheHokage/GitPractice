package com.git.gitpractice.Service;

import com.git.gitpractice.Data.model.User;

public interface UserService {
    User signUp (String username, String password);
    String login(String usernmae, String password);

    String dance(String name);

    String swim(String name);

    void deleteUser (String id);

}

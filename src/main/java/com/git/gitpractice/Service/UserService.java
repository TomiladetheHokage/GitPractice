package com.git.gitpractice.Service;

import com.git.gitpractice.Data.model.User;

public interface UserService {
    User signUp (String username, String password);
}

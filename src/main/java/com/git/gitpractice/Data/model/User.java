package com.git.gitpractice.Data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter

public class User {
    private long id;
    private String name;
    private String password;
}

package com.pm.user.domain.model;

import com.pm.user.domain.vo.UserID;

import java.util.UUID;

public class User {

    private UserID userID;
    private String name;
    private String email;

    public User(String name, String email) {
        this.userID = new UserID(UUID.randomUUID().toString());
        this.name = name;
        this.email = email;
    }

    public User(UserID userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    public UserID getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

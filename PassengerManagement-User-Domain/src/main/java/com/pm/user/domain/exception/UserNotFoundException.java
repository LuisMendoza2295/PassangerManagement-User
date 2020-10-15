package com.pm.user.domain.exception;

import com.pm.user.domain.vo.UserID;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(UserID userID) {
        super("User not found with id: " + userID.getValue());
    }
}

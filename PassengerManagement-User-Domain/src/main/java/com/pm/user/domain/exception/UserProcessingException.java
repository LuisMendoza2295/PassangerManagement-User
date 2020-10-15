package com.pm.user.domain.exception;

public class UserProcessingException extends Exception {

    public UserProcessingException() {
        super("General error on processing user request");
    }

    public UserProcessingException(Throwable t) {
        super("General error on processing user request", t);
    }
}

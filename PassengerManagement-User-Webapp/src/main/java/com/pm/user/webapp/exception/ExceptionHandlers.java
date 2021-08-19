package com.pm.user.webapp.exception;

import com.pm.user.domain.exception.UserNotFoundException;
import com.pm.user.domain.exception.UserProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlers {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlers.class);

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String userNotFoundExceptionHandler(UserNotFoundException e) {
        LOGGER.error(e.getMessage(), e);
        return e.getMessage();
    }

    @ExceptionHandler(UserProcessingException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String userProcessingExceptionHandler(UserProcessingException e) {
        LOGGER.error(e.getMessage(), e);
        return e.getMessage();
    }
}

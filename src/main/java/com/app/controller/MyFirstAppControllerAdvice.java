package com.app.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyFirstAppControllerAdvice {

    @ExceptionHandler(exception = Exception.class)
    public String handleException(Exception exception){
        return exception.getMessage();
    }
}

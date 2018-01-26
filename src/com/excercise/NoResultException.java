package com.excercise;

public class NoResultException extends Exception {
    public NoResultException(String message){
        super(message);
        getMessage();
    }
}

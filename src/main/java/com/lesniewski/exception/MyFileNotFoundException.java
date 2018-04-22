package com.lesniewski.exception;

/**
 * Created by Adrian on 4/22/2018.
 */
public class MyFileNotFoundException extends RuntimeException {
    public MyFileNotFoundException(String message) {
        super(message);
    }

    public MyFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
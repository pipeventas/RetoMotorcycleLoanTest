package com.motorcycleloantest.exceptions;
public class InvalidValueException extends RuntimeException {

    public InvalidValueException(String message) {
        super(message);
    }
}
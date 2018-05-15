package com.higgsup.CustomExceptions;

public class CustomException extends Exception {
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public CustomException(String message) {
        super(message);
    }
}

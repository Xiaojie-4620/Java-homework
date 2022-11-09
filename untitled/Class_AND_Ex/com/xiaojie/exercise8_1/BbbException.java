package com.xiaojie.exercise8_1;

public class BbbException extends Exception {
    private String message;
    public BbbException() {
    }

    public BbbException(String message) {
        super(message);
        this.message = message;
    }
}

package com.xiaojie.exercise8_1;

public class AaaException extends Exception {
    private String message;
    public AaaException() {

    }

    public AaaException(String message){
       super(message);
       this.message = message;
    }
}

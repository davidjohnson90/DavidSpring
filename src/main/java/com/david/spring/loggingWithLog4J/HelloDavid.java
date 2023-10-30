package com.david.spring.loggingWithLog4J;

public class HelloDavid {
    private String message;

    public String getMessage() {
        System.out.println("The message is: " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
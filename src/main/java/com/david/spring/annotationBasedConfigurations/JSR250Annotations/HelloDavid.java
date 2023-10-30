package com.david.spring.annotationBasedConfigurations.JSR250Annotations;

public class HelloDavid {
    private String message;

    public String getMessage() {
        System.out.println("The message is: " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // For the lifecycle of the bean
    public void init() {
        System.out.println("Bean is going through init...");
    }

    public void destroy() {
        System.out.println("Bean will destroy now...");
    }
}
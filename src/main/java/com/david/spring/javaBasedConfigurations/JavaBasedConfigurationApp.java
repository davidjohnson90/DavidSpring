package com.david.spring.javaBasedConfigurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloDavidConfig.class);
        HelloDavid helloDavid = applicationContext.getBean(HelloDavid.class);
        helloDavid.setMessage("Hello David");
        helloDavid.getMessage();
    }
}

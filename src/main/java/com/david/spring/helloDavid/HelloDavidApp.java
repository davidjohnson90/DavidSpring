package com.david.spring.helloDavid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloDavidApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloDavid helloDavid = (HelloDavid) applicationContext.getBean("helloDavid");
        helloDavid.getMessage();
    }
}

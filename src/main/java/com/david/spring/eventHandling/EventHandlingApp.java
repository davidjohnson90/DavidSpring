package com.david.spring.eventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlingApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("EventHandlingBean.xml");

        configurableApplicationContext.start();

        HelloDavid helloDavid = (HelloDavid) configurableApplicationContext.getBean("helloDavid");
        helloDavid.getMessage();

        configurableApplicationContext.stop();
    }
}
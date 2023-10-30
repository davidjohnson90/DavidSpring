package com.david.spring.customEvents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomEventApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("CustomEventBean.xml");
        CustomEventPublisher customEventPublisher = (CustomEventPublisher) configurableApplicationContext.getBean("customEventPublisher");

        customEventPublisher.publish();
        customEventPublisher.publish();
    }
}
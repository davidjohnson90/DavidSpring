package com.david.spring.beans.lifecycle;

import com.david.spring.helloDavid.HelloDavid;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class    BeanLifeCycleApp {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        HelloDavid helloDavid = (HelloDavid) abstractApplicationContext.getBean("beanLifecycle");
        helloDavid.getMessage();
        abstractApplicationContext.registerShutdownHook();
    }
}

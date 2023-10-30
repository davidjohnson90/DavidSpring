package com.david.spring.beans.postProcessors;

import com.david.spring.helloDavid.HelloDavid;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorApp {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("PostProcessorBeans.xml");

        HelloDavid helloDavid = (HelloDavid) abstractApplicationContext.getBean("postProcessorBean");
        helloDavid.getMessage();
        abstractApplicationContext.registerShutdownHook();
    }
}

package com.david.spring.loggingWithLog4J;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class LoggingWithLog4JApp {
    static Logger log = Logger.getLogger(LoggingWithLog4JApp.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("LoggingWithLog4JBean.xml");
        log.info("Going to create HelloDavid Object");
        HelloDavid helloDavid = (HelloDavid) context.getBean("helloDavid");
        helloDavid.getMessage();

        log.warning("Exiting the program");
    }
}

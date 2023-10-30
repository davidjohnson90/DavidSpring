package com.david.spring.iocContainers;

import com.david.spring.helloDavid.HelloDavid;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCBeanContainerApp {
    public static void main(String[] args) {
//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        HelloDavid helloDavid = (HelloDavid) xmlBeanFactory.getBean("helloDavid");
//        helloDavid.getMessage();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloDavid helloDavid = (HelloDavid) applicationContext.getBean("helloDavid");
        helloDavid.getMessage();
    }
}

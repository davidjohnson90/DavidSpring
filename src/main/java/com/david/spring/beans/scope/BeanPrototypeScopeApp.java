package com.david.spring.beans.scope;

import com.david.spring.helloDavid.HelloDavid;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPrototypeScopeApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloDavid helloDavidObject1 = (HelloDavid) applicationContext.getBean("prototypeBean");
        helloDavidObject1.setMessage("I am object 1");
        helloDavidObject1.getMessage();

        HelloDavid helloDavidObject2 = (HelloDavid) applicationContext.getBean("prototypeBean");
        helloDavidObject2.getMessage();
    }
}

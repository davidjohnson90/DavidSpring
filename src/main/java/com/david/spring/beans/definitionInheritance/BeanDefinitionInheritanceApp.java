package com.david.spring.beans.definitionInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefinitionInheritanceApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeansDefinitionInheritance.xml");

        HelloParent helloParent = (HelloParent) applicationContext.getBean("helloParent");
        helloParent.getMessage1();
        helloParent.getMessage2();

        HelloChild helloChild = (HelloChild) applicationContext.getBean("helloChild");
        helloChild.getMessage1();
        helloChild.getMessage2();
        helloChild.getMessage3();
    }
}

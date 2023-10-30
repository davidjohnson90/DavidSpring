package com.david.spring.aopAspectJBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPAspectJBasedApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOPAspectJBasedBean.xml");

        Student student = (Student) applicationContext.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}

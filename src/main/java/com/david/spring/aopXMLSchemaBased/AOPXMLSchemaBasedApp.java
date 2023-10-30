package com.david.spring.aopXMLSchemaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPXMLSchemaBasedApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOPXMLSchemaBasedBean.xml");

        Student student = (Student) applicationContext.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}

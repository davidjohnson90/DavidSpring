package com.david.spring.annotationBasedConfigurations.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierAnnotationApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AnnotationQualifierBean.xml");
        StudentProfile studentProfile = (StudentProfile) applicationContext.getBean("studentProfile");
        studentProfile.printAge();
        studentProfile.printName();
    }
}

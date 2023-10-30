package com.david.spring.jdbcFramework.SQLStoredProcedures;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SQLStoredProceduresApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SQLStoredProcedureBean.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation--------");
        studentJDBCTemplate.create("Arun", 32);
        studentJDBCTemplate.create("David", 32);
        studentJDBCTemplate.create("Jenifer", 30);

        System.out.println("------Listing Multiple Records--------");
        List<Student> students = studentJDBCTemplate.listStudents();

        for (Student record : students) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Listing Record with ID = 2 -----");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId());
        System.out.print(", Name : " + student.getName());
        System.out.println(", Age : " + student.getAge());
    }
}
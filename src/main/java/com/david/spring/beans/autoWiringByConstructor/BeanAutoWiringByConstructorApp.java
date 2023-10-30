package com.david.spring.beans.autoWiringByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAutoWiringByConstructorApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanAutoWiringByConstructor.xml");
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
        textEditor.getName();
        textEditor.getSpellChecker();
        textEditor.spellCheck();
    }
}

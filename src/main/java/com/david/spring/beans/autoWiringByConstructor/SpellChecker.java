package com.david.spring.beans.autoWiringByConstructor;

public class SpellChecker {
    public SpellChecker() {
        System.out.println("Inside SpellChecker Constructor");
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling");
    }
}

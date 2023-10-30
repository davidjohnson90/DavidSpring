package com.david.spring.javaBasedConfigurations.injectingBeanDependencies;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor Constructor");
        this.spellChecker = spellChecker;
    }
    
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
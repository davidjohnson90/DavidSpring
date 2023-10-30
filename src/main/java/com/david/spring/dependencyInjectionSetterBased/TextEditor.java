package com.david.spring.dependencyInjectionSetterBased;

public class TextEditor {

    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        System.out.println("Inside getSpellChecker");
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}

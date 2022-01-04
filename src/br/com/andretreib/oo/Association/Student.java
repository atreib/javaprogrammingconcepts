package br.com.andretreib.oo.Association;

/**
 * Our class Student exists by itself
 */
public class Student {
    private String name;

    Student (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
